package com.quattroventi.trip.Core.Servizio.persistence;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.*;


import com.quattroventi.trip.Model.Business.Ppa;
import com.quattroventi.trip.Model.Business.Ppa;
import com.quattroventi.trip.Utils.Converter;

import java.util.List;

public class PpaAdapter extends GenericAdapter{

    private boolean firstacces;

    //Costruttore
    public PpaAdapter(Context context) {
       super(context);
    }

    public void addPpa(Ppa ppa){
        open();
        ContentValues valori = new ContentValues();
        valori.put(KEY_ID, ppa.getID());
        valori.put(KEY_NOME, ppa.getNome());
        valori.put(KEY_INDIRIZZO, ppa.getIndirizzo());
        valori.put(KEY_COORDINATE, Converter.latLngToDbString(ppa.getCoordinate()));
        database.insert(TABLE_PPA,null, valori);
        close();
    }


    public List<Ppa> getByViaggio() {return null;}//TODO getByViaggio (ppa))
    public Ppa getById() {return null;}//TODO getById (ppa))
    public boolean update() {return false;}//TODO update (ppa))
    public boolean insert() {return false;}//TODO insert (ppa))
}
