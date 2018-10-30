package com.quattroventi.trip.Core.Servizio.persistence;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.*;


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
        valori.put(KEY_ID, ppa.getID());
        valori.put(KEY_NOME, ppa.getNome());
        valori.put(KEY_INDIRIZZO, ppa.getIndirizzo());
        valori.put(KEY_LAT, ppa.getCoordinate().latitude);
        valori.put(KEY_LON,ppa.getCoordinate().longitude);
        database.insert(TABLE_PPA,null, valori);
        close();
    }
}
