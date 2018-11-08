package com.quattroventi.trip.Core.Servizio.persistence;

public class TableConstant {

    // CHIAVI GENERALI --- INIZIO
    public static final String KEY_ID = "_id ";
    public static final String KEY_NOME = "nome ";
    public static final String KEY_LAT = "lat ";
    public static final String KEY_LON = "lon ";
    public static final String KEY_DESCRIZIONE = "descrizione ";
    public static final String KEY_INDIRIZZO = "indirizzo ";
    public static final String KEY_COSTO = "costo ";
    public static final String KEY_DURATA_SOSTA = "durata_sosta ";
    public static final String KEY_NOTE = "note ";
    public static final String KEY_ORA_ARRIVO = "ora_arrivo ";
    public static final String KEY_ORA_PARTENZA = "ora_partenza ";
    public static final String KEY_PLACE_ID = "place_id ";
    public static final String KEY_SEQ_NOTTE = "seq_notte ";
    public static final String KEY_TIPO_DURATA = "tipo_durata ";
    public static final String KEY_WEB_LINK = "web_link ";
    public static final String KEY_IMPORTANZA_CDF = "importanza ";
    public static final String KEY_DATA = "data ";
    public static final String KEY_OBBLIGATORIO_CDP = "obbligatorio ";
    public static final String KEY_ARRIVO = "arrivo ";
    public static final String KEY_PARTENZA = "partenza ";
    public static final String KEY_COSTO_CARBURANTE = "costo_carb ";
    public static final String KEY_COSTO_AUTOSTRADA = "costo_starda ";
    public static final String KEY_DISTANZA = "distanza ";
    public static final String KEY_TEMPO_PREVISTO_PERCORRENZA_ROTTTA = "tempo_previsto_percorrenza ";
    public static final String KEY_SEQ_ROTTA = "seq_rotta ";
    public static final String KEY_TRACCIATO_ROTTA = "tracciato_rotta ";
    public static final String KEY_COORDINATE = "coordinate ";

    // CHIAVI GENERALI --- FINE


    // NOMI TABELLE--- INIZIO
    public static final String TABLE_VIAGGIO = "viaggio ";
    public static final String TABLE_PPA = "punti_partenza_arrivo ";
    public static final String TABLE_CDF = "cose_da_fare ";
    public static final String TABLE_CDP = "cose_da_pagare ";
    public static final String TABLE_FERMATA = "fermata ";
    public static final String TABLE_PAUSANOTTE = "pausa_notte ";
    public static final String TABLE_ROTTA = "rotta ";
    public static final String TABLE_TAPPA = "tappa ";
    // NOMI TABELLE--- FINE


    // TAG GENERALI --- INIZIO
    public static final String CREATE = "CREATE TABLE ";
    public static final String INT_TYPE = "INTEGER ";
    public static final String PRIMARY_KEY = "PRIMARY KEY ";
    public static final String PRIMARY_KEY_AUT = "INTEGER PRIMARY KEY AUTOINCREMENT ";
    public static final String NOT_NULL = "NOT NULL ";
    public static final String V = ", ";
    public static final String CREATE_END = "); ";
    public static final String CREATE_START = "( ";

    public static final String STRING_TYPE = "VARCHAR ";
    public static final String LATLNG_TYPE = "VARCHAR ";
    public static final String DOUBLE_TYPE = "DOUBLE ";
    public static final String FLOAT_TYPE = "FLOAT ";
    public static final String BOOLEAN_TYPE = "INT ";
    public static final String DATE_TYPE = "VARCHAR ";
    public static final String LONG_TYPE = "LONG ";
    // TAG GENERALI --- FINE

}



