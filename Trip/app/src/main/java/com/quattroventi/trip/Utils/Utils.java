package com.quattroventi.trip.Utils;

import com.google.android.gms.maps.model.LatLng;

import java.util.List;

public class Utils {

    public static boolean checkString(String s) {
        if (s == null)
            return false;
        if (s.equals(""))
            return false;
        if (s.equals(" "))
            return false;

        return true;
    }


    public static boolean checkList(List list) {
        if (list == null)
            return false;
        if (list.isEmpty())
            return false;

        return true;
    }

    public static String getLatLongUrlFormatted(LatLng latLng) {
        String output = "";
        if (latLng != null) {
            output += String.valueOf(latLng.latitude);
            output += ",";
            output += String.valueOf(latLng.longitude);
        }
        return output;
    }
}
