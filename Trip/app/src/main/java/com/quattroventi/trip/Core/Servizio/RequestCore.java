package com.quattroventi.trip.Core.Servizio;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.RequestFuture;
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
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

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

    public <T> void addToRequestQueque(Request<T> req) {
        getRequestQueue().add(req);
    }



}

