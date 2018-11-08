package com.quattroventi.trip.Core.Servizio;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.android.gms.location.places.Place;
import com.google.gson.Gson;
import com.quattroventi.trip.Model.Business.Fermata;
import com.quattroventi.trip.Model.Servizio.MapsDirectionApiOption;
import com.quattroventi.trip.Model.Servizio.mapsModel.DirectionsResult;
import com.quattroventi.trip.Model.Servizio.mapsModel.DirectionsRoute;
import com.quattroventi.trip.Model.Servizio.mapsModel.GeocodedWaypointStatus;
import com.quattroventi.trip.Model.Servizio.mapsModel.TravelMode;
import com.quattroventi.trip.R;
import com.quattroventi.trip.Utils.Constant;
import com.quattroventi.trip.Utils.Utils;

import org.json.JSONObject;

import java.util.Arrays;
import java.util.List;

public class MapsDirectionApiHelper {

    public List<DirectionsRoute> call(Context context, Fermata partenza, Place arrivo, MapsDirectionApiOption option) {

        Thread t = new Thread();
        t.run();
        String apiKey = context.getResources().getString(R.string.google_maps_key);
        String url = getUrl(partenza, arrivo, option, apiKey);

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        Gson gson = new Gson();
                        DirectionsResult result = gson.fromJson(response.toString().replaceAll("-", "_"), DirectionsResult.class);

                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO: Handle error

                    }
                });


        RequestCore.getInstance(context).addToRequestQueue(jsonObjectRequest);

        return null;
    }




    private String getUrl(Fermata partenza, Place arrivo, MapsDirectionApiOption option, String apiKey) {

        if (arrivo == null)
            return "";
        if (arrivo.getLatLng() == null)
            return "";


        StringBuilder sb = new StringBuilder();
        sb.append(Constant.MAPS_DIRECTION_API_URL);
        sb.append("?origin=");
        sb.append(Utils.getLatLongUrlFormatted(partenza.getCoordinate()));
        sb.append("&destination=");
        sb.append(Utils.getLatLongUrlFormatted(arrivo.getLatLng()));
        sb.append(valutaMezzoTrasporto(option.getMezzo_usato()));
        sb.append(valutaOpzioniLimitazioni(option.getLista_limitazioni()));
        if (option.isAlternative())
            sb.append("&alternatives=true");


        sb.append("&key=");
        sb.append(apiKey);

        System.out.println(sb.toString());
        return sb.toString();
    }

    private String valutaOpzioniLimitazioni(List<Constant.DIRECTION_OPTION_EVITA> list) {
        String output = "";
        if (Utils.checkList(list)) {
            output = "&avoid=";
            for (int x = 0; x < list.size(); x++) {
                Constant.DIRECTION_OPTION_EVITA o = list.get(x);
                switch (o) {
                    case PEDAGGI:
                        output += "tolls";
                        break;
                    case AUTOSTRADE:
                        output += "highways";
                        break;
                    case TRAGHETI:
                        output += "ferries";
                        break;
                }

                if (x < list.size() - 1) {
                    output += "|";
                }


            }
        }
        return output;
    }

    private String valutaMezzoTrasporto(Constant.DIRECTION_OPTION_MODE opz) {
        String output = "&mode";
        if (opz != null) {
            switch (opz) {
                case AUTO:
                    output += TravelMode.DRIVING.toUrlValue();
                    break;
                case TRANSPORT:
                    output += TravelMode.TRANSIT.toUrlValue();
                    break;
                case BICI:
                    output += TravelMode.BICYCLING.toUrlValue();
                    break;
            }
        } else {
            output += TravelMode.DRIVING.toUrlValue();
        }


        return output;
    }


}