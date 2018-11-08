package com.quattroventi.trip.Utils;

import com.google.android.gms.location.places.Place;
import com.google.android.gms.maps.model.LatLng;
import com.quattroventi.trip.Model.Business.Fermata;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Converter {

    public void PlaceToFermata(Place place, Fermata f) {
        if (place != null) {
            f.setCoordinate(place.getLatLng());
            f.setNome(place.getName().toString());
        }

    }

    public static String latLngToDbString(LatLng latLng) {
        return Utils.getLatLongUrlFormatted(latLng);
    }

    public static LatLng dbStringlatLng(String s) {
        String[] spitted = s.split(",");
        if (Utils.checkString(spitted[0]) && Utils.checkString(spitted[1])) {
            return new LatLng(Double.valueOf(spitted[0]), Double.valueOf(spitted[1]));
        } else {
            return new LatLng(0D, 0D);
        }

    }

    public static com.quattroventi.trip.Model.Servizio.mapsModel.LatLng latLngToLatlng(LatLng latLng) {
        return new com.quattroventi.trip.Model.Servizio.mapsModel.LatLng(latLng.latitude, latLng.longitude);
    }

    public static LatLng latLngToLatlng(com.quattroventi.trip.Model.Servizio.mapsModel.LatLng latLng) {
        return new LatLng(latLng.lat, latLng.lng);
    }

    public static String dateTodbString(Date date) {
        if (date != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy HH-mm");
            return sdf.format(date);
        }

        return "";


    }


    public static Date dateTodbString(String date) {
        if (date != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy HH-mm");
            try {
                return sdf.parse(date);

            } catch (Exception e) {

            }
        }
        return new Date();


    }





}
