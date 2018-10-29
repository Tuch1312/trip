package com.quattroventi.trip.Utils;

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
}
