package com.quattroventi.trip.Core.Servizio.persistence;

import android.content.Context;

import com.quattroventi.trip.Model.Business.Rotta;

import java.util.List;

public class RottaAdapter extends GenericAdapter {
    protected RottaAdapter(Context context) {
        super(context);
    }


    public List<Rotta> getByViaggio() {return null;}//TODO getByViaggio (rotta))
    public Rotta getById() {return null;}//TODO getById (rotta))
    public Rotta getByPartenza() {return null;}//TODO getByPartenza (rotta))
    public Rotta getByArrivo() {return null;}//TODO getByArrivo (rotta))
    public boolean update() {return false;}//TODO update (rotta))
    public boolean insert() {return false;}//TODO insert (rotta))
}
