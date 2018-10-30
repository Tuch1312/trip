package com.quattroventi.trip.Model.Servizio;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends  SQLiteOpenHelper{

    private static final String DB_NAME = "viaggi";
    private static final int DB_VERSION = 1;

    public static final String TABLE_VIAGGIO = "viaggio";
    public static final String TABLE_PPA = "punti partenza/arrivo";
    public static final String TABLE_CDF = "cose da fare";
    public static final String TABLE_CDP = "cose da pagare";
    public static final String TABLE_FERMATA = "fermata";
    public static final String TABLE_PAUSANOTTE = "pausa notte";
    public static final String TABLE_ROTTA = "rotta";
    public static final String TABLE_TAPPA = "tappa";

    private static final String SQL_CREATE_PPA = "CREATE TABLE puntiPartenzaArrivo " +
            "(_id String primary key, nome String,lat double,lon double,descrizione String," +
            "indirizzo String;";

    //chiavi Ppa
    public static final String KEY_ID_PPA = "_id";
    public static final String KEY_NOME_PPA = "nome";
    public static final String KEY_LAT_PPA = "lat";
    public static final String KEY_LON_PPA = "lon";
    public static final String KEY_DESCRIZIONE_PPA = "descrizione";
    public static final String KEY_INDIRIZZO_PPA = "indirizzo";

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
}
