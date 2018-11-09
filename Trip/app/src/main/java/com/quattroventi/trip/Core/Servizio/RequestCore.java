package com.quattroventi.trip.Core.Servizio;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.quattroventi.trip.Model.Servizio.mapsModel.DirectionsResult;
import com.quattroventi.trip.Model.Servizio.mapsModel.DirectionsRoute;
import com.quattroventi.trip.Model.Servizio.mapsModel.GeocodedWaypointStatus;
import com.quattroventi.trip.Utils.Utils;

import org.json.JSONObject;

import java.util.Arrays;
import java.util.List;

public class RequestCore {

    private static RequestCore mInstance;
    private RequestQueue mRequestQueue;
    private Context mCtx;

    private RequestCore(Context context) {
        mCtx = context;
        mRequestQueue = getRequestQueue();
    }

    public static synchronized RequestCore getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new RequestCore(context);
        }
        return mInstance;
    }

    public RequestQueue getRequestQueue() {
        if (mRequestQueue == null) {
            // getApplicationContext() is key, it keeps you from leaking the
            // Activity or BroadcastReceiver if someone passes one in.
            mRequestQueue = Volley.newRequestQueue(mCtx.getApplicationContext());
        }
        return mRequestQueue;
    }

    public synchronized <T> void addToRequestQueue(Request<T> req) {
        getRequestQueue().add(req);
    }


    public String call(final Context context, final String url, final int method, final JSONObject request) {

        Thread executor = new Thread() {
            public void run() {

                JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                        (method, url, request, new Response.Listener<JSONObject>() {

                            @Override
                            public void onResponse(JSONObject response) {
                                Memory memory = Memory.getInstance();
                                memory.setAwaitingDirectionResponse(false);
                                memory.setResponse(response.toString());
                            }
                        }, new Response.ErrorListener() {

                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Memory memory = Memory.getInstance();
                                memory.setAwaitingDirectionResponse(false);
                                // TODO: Handle error

                            }
                        });

                RequestCore.getInstance(context).addToRequestQueue(jsonObjectRequest);

            }

        };

        Memory memory = Memory.getInstance();
        memory.setAwaitingDirectionResponse(true);
        executor.start();
        do {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                Log.e("Chiamata rest", "Errore in thread.wait", e);
            }

        } while (memory.isAwaitingDirectionResponse());


        if (Utils.checkString(memory.getResponse()))
            return memory.getResponse();
        else
            return "";


    }

}

