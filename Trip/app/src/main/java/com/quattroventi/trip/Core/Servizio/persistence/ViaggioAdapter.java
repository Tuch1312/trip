package com.quattroventi.trip.Core.Servizio.persistence;

import android.content.Context;

import com.quattroventi.trip.Model.Business.Viaggio;

import java.util.List;

public class ViaggioAdapter extends GenericAdapter {
    protected ViaggioAdapter(Context context) {
        super(context);
    }

    public Viaggio getById() {
        return null;
    }//TODO getById (viaggio))

    public Viaggio getDefault() {
        return null;
    }//TODO getDefault (viaggio))

    public List<Viaggio> getAll() {
        return null;
    }//TODO getAll (viaggio))

    public List<Viaggio> getNotAlreadyDone() {
        return null;
    }//TODO getnotAlreadyDone (viaggio))

    public List<Viaggio> getAlreadyDone() {
        return null;
    }//TODO getAlreadyDone (viaggio))

    public boolean update() {
        return false;
    }//TODO update (viaggio))

    public boolean insert() {
        return false;
    }//TODO insert (viaggio))
}
