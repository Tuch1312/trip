package com.quattroventi.trip.Core.Servizio.persistence;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.BOOLEAN_TYPE;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.CREATE;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.CREATE_END;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.CREATE_START;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.DATE_TYPE;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.DOUBLE_TYPE;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.FLOAT_TYPE;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.INT_TYPE;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_ARRIVO;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_COORDINATE;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_COSTO;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_COSTO_AUTOSTRADA;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_COSTO_CARBURANTE;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_DATA;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_DESCRIZIONE;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_DISTANZA;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_DURATA_SOSTA;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_ID;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_IMPORTANZA_CDF;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_INDIRIZZO;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_LAT;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_LON;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_NOME;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_NOTE;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_OBBLIGATORIO_CDP;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_ORA_ARRIVO;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_ORA_PARTENZA;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_PARTENZA;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_PLACE_ID;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_SEQ_ROTTA;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_TEMPO_PREVISTO_PERCORRENZA_ROTTTA;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_TIPO_DURATA;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_TRACCIATO_ROTTA;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_WEB_LINK;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.LATLNG_TYPE;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.LONG_TYPE;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.PRIMARY_KEY_AUT;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.STRING_TYPE;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.TABLE_CDF;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.TABLE_PAUSANOTTE;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.TABLE_PPA;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.TABLE_ROTTA;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.TABLE_TAPPA;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.TABLE_VIAGGIO;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.V;


public class DbHelper extends SQLiteOpenHelper {

    protected static final String DB_NAME = "viaggi";
    private static final int DB_VERSION = 1;


    // SQL CREA TABELLE --- INIZIO


    public static final String SQL_CREATE_PPA =
            getCreateStatement(TABLE_PPA) +
                    KEY_NOME + STRING_TYPE + V +
                    KEY_LAT + DOUBLE_TYPE + V +
                    KEY_LON + DOUBLE_TYPE + V +
                    KEY_DESCRIZIONE + STRING_TYPE + V +
                    KEY_INDIRIZZO + STRING_TYPE + CREATE_END;


    public static final String SQL_CREATE_VIAGGIO =
            getCreateStatement(TABLE_VIAGGIO) +
                    KEY_NOME + STRING_TYPE + V +
                    KEY_DESCRIZIONE + STRING_TYPE + V +
                    KEY_NOTE + STRING_TYPE + V +
                    KEY_PARTENZA + INT_TYPE + V +
                    KEY_ARRIVO + INT_TYPE + V +
                    KEY_COSTO + FLOAT_TYPE + CREATE_END;


    public static final String SQL_CREATE_TAPPA =
            getCreateStatement(TABLE_TAPPA) +
                    KEY_NOME + STRING_TYPE + V +
                    KEY_DESCRIZIONE + STRING_TYPE + V +
                    KEY_NOTE + STRING_TYPE + V +
                    KEY_COSTO + FLOAT_TYPE + V +
                    KEY_COORDINATE + LATLNG_TYPE + V +
                    KEY_DURATA_SOSTA + INT_TYPE + V +
                    KEY_ORA_ARRIVO + DATE_TYPE + V +
                    KEY_ORA_PARTENZA + DATE_TYPE + V +
                    KEY_PLACE_ID + STRING_TYPE + V +
                    KEY_TIPO_DURATA + STRING_TYPE + CREATE_END;


    public static final String SQL_CREATE_ROTTA =
            getCreateStatement(TABLE_ROTTA) +

                    KEY_PARTENZA + INT_TYPE + V +
                    KEY_ARRIVO + INT_TYPE + V +
                    KEY_COSTO_AUTOSTRADA + FLOAT_TYPE + V +
                    KEY_COSTO_CARBURANTE + FLOAT_TYPE + V +
                    KEY_DISTANZA + INT_TYPE + V +
                    KEY_SEQ_ROTTA + INT_TYPE + V +
                    KEY_TEMPO_PREVISTO_PERCORRENZA_ROTTTA + LONG_TYPE + V +
                    KEY_TRACCIATO_ROTTA + STRING_TYPE + CREATE_END;


    public static final String SQL_CREATE_PAUSA_NOTTE =
            getCreateStatement(TABLE_PAUSANOTTE) +
                    KEY_NOME + STRING_TYPE + V +
                    KEY_DESCRIZIONE + STRING_TYPE + V +
                    KEY_NOTE + STRING_TYPE + V +
                    KEY_COSTO + FLOAT_TYPE + V +
                    KEY_COORDINATE + LATLNG_TYPE + V +
                    KEY_DURATA_SOSTA + INT_TYPE + V +
                    KEY_ORA_ARRIVO + DATE_TYPE + V +
                    KEY_ORA_PARTENZA + DATE_TYPE + V +
                    KEY_PLACE_ID + STRING_TYPE + V +
                    KEY_INDIRIZZO + STRING_TYPE + V +
                    KEY_WEB_LINK + STRING_TYPE + V +
                    KEY_TIPO_DURATA + STRING_TYPE + CREATE_END;


    public static final String SQL_CREATE_CDP =
            getCreateStatement(TABLE_CDF) +
                    KEY_NOME + STRING_TYPE + V +
                    KEY_DESCRIZIONE + STRING_TYPE + V +
                    KEY_COSTO + FLOAT_TYPE + V +
                    KEY_DATA + DATE_TYPE + V +
                    KEY_INDIRIZZO + FLOAT_TYPE + V +
                    KEY_COORDINATE + LATLNG_TYPE + V +
                    KEY_OBBLIGATORIO_CDP + BOOLEAN_TYPE + CREATE_END;


    public static final String SQL_CREATE_CDF =
            getCreateStatement(TABLE_CDF) +
                    KEY_NOME + STRING_TYPE + V +
                    KEY_DESCRIZIONE + STRING_TYPE + V +
                    KEY_NOTE + STRING_TYPE + V +
                    KEY_COSTO + FLOAT_TYPE + V +
                    KEY_COORDINATE + LATLNG_TYPE + V +
                    KEY_DURATA_SOSTA + INT_TYPE + V +
                    KEY_ORA_ARRIVO + DATE_TYPE + V +
                    KEY_ORA_PARTENZA + DATE_TYPE + V +
                    KEY_PLACE_ID + STRING_TYPE + V +
                    KEY_INDIRIZZO + STRING_TYPE + V +
                    KEY_WEB_LINK + STRING_TYPE + V +
                    KEY_IMPORTANZA_CDF + INT_TYPE + V +
                    KEY_TIPO_DURATA + STRING_TYPE + CREATE_END;


    //Costruttore
    public DbHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_PPA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PPA);
        onCreate(db);
    }

    private static String getCreateStatement(String table) {
        return CREATE + DB_NAME + "." + table + CREATE_START + KEY_ID + PRIMARY_KEY_AUT + V;
    }


}
