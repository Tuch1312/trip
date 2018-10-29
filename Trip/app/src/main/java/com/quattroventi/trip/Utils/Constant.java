package com.quattroventi.trip.Utils;

public class Constant {


    public static enum TIPO_DURATA {
        ORE,
        NOTTI
    }

    public static enum DIRECTION_OPTION_MODE {
        AUTO,
        BICI,
        TRANSPORT
    }

    public static enum DIRECTION_OPTION_EVITA {
        AUTOSTRADE,
        PEDAGGI,
        TRAGHETI
    }

    public static final String FRAGMENT_NUOVO_VIAGGIO_KEY = "01";
    public static final String FRAGMENT_MODIFICA_VIAGGIO_KEY = "02";
    public static final String FRAGMENT_NUOVA_SOSTA_NOTTE_KEY = "03";
    public static final String FRAGMENT_MODIFICA_SOSTA_NOTTE_KEY = "04";
    public static final String FRAGMENT_NUOVA_CDF_KEY = "05";
    public static final String FRAGMENT_MODIFICA_CDF_KEY = "06";
    public static final String FRAGMENT_NUOVA_CDP_KEY = "07";
    public static final String FRAGMENT_MODIFICA_CDP_KEY = "08";
    public static final String FRAGMENT_NUOVA_PPA_KEY = "09";
    public static final String FRAGMENT_MODIFICA_PPA_KEY = "10";
    public static final String FRAGMENT_NUOVA_TAPPA_KEY = "11";
    public static final String FRAGMENT_MODIFICA_TAPPA_KEY = "12";

    public static final String MAPS_DIRECTION_API_URL = "http://maps.googleapis.com/maps/api/directions/json/";

}
