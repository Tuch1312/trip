package com.quattroventi.trip.Model.Servizio;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.quattroventi.trip.Model.Business.Ppa;

public class PpaAdapter {
    private Context context;
    private SQLiteDatabase database;
    private DbHelper dbHelper;
    private boolean firstacces;

    //Costruttore
    public PpaAdapter(Context context){
        this.context = context;
    }


    private  PpaAdapter open() throws SQLException{
        dbHelper = new DbHelper(context);
        database = dbHelper.getWritableDatabase();
        return this;
    }

    private void close() {
        dbHelper.close();
        database.close();
    }

    public void addPpa(Ppa ppa){
        open();
        ContentValues valori = new ContentValues();
        valori.put(DbHelper.KEY_ID_PPA, ppa.getID());
        valori.put(DbHelper.KEY_NOME_PPA, ppa.getNome());
        valori.put(DbHelper.KEY_INDIRIZZO_PPA, ppa.getIndirizzo());
        valori.put(DbHelper.KEY_LAT_PPA, ppa.getCoordinate().latitude);
        valori.put(DbHelper.KEY_LON_PPA,ppa.getCoordinate().longitude);
        database.insert(DbHelper.TABLE_PPA,null, valori);
        close();
    }
}
