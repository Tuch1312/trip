package com.quattroventi.trip.Core.Servizio;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.android.gms.location.places.Place;
import com.quattroventi.trip.Model.Business.Viaggio;
import com.quattroventi.trip.Model.Servizio.MapsDirectionApiOption;
import com.quattroventi.trip.Utils.Constant;

import org.json.JSONObject;

public class MapsDirectionApiHelper {

    public void call(Context context, Place place, MapsDirectionApiOption option) {


        String url = "http://my-json-feed";

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO: Handle error

                    }
                });

        RequestCore.getInstance(context).addToRequestQueue(jsonObjectRequest);
    }

    private String getUrl(Place place, MapsDirectionApiOption option) {

        if (place == null)
            return "";
        if (Memory.getInstance().getViaggioCorrente() == null)
            return "";
        if (place.getLatLng() == null)
            return "";

        Viaggio viaggio = Memory.getInstance().getViaggioCorrente();
        StringBuilder sb = new StringBuilder();
        sb.append(Constant.MAPS_DIRECTION_API_URL);
        sb.append("?origin=");
        sb.append(viaggio.getListaTappe().getLast().getCoordinate().toString());



        if (place.getLatLng() != null) {
            sb.append(place.getLatLng().toString());
        }
    return null;
    }
}
