package com.quattroventi.trip.Core.Servizio;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class RequestCore {

        private static RequestCore mInstance;
        private RequestQueue mRequestQueue;
        private static Context mCtx;

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

        public <T> void addToRequestQueue(Request<T> req) {
            getRequestQueue().add(req);
        }




    }

