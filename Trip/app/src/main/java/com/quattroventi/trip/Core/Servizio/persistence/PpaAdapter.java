package com.quattroventi.trip.Core.Servizio.persistence;

import android.content.ContentValues;
import android.content.Context;

import com.quattroventi.trip.Model.Business.Ppa;

import java.util.List;

import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_ID;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_INDIRIZZO;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_LAT;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_LON;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_NOME;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.TABLE_PPA;

public class PpaAdapter extends GenericAdapter {

    private boolean firstacces;

    //Costruttore
    public PpaAdapter(Context context) {
        super(context);
    }

    public void addPpa(Ppa ppa) {
        open();
        ContentValues valori = new ContentValues();
        valori.put(KEY_ID, ppa.getID());
        valori.put(KEY_NOME, ppa.getNome());
        valori.put(KEY_INDIRIZZO, ppa.getIndirizzo());
        valori.put(KEY_LAT, ppa.getCoordinate().latitude);
        valori.put(KEY_LON, ppa.getCoordinate().longitude);
        database.insert(TABLE_PPA, null, valori);
        close();
    }


    public List<Ppa> getByViaggio() {
        return null;
    }//TODO getByViaggio (ppa))

    public Ppa getById() {
        return null;
    }//TODO getById (ppa))

    public boolean update() {
        return false;
    }//TODO update (ppa))

    public boolean insert() {
        return false;
    }//TODO insert (ppa))
}
