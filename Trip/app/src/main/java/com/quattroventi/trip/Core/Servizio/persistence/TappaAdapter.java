package com.quattroventi.trip.Core.Servizio.persistence;

import android.content.Context;

import com.quattroventi.trip.Model.Business.Tappa;

import java.util.List;

public class TappaAdapter extends GenericAdapter {
    protected TappaAdapter(Context context) {
        super(context);
    }

    public List<Tappa> getByViaggio() {
        return null;
    }//TODO getByViaggio (tappa))

    public Tappa getById() {
        return null;
    }//TODO getById (tappa))

    public List<Tappa> getByRotta() {
        return null;
    }//TODO getByRotta (tappa))

    public boolean update() {
        return false;
    }//TODO update (tappa))

    public boolean insert() {
        return false;
    }//TODO insert (tappa))
}
