package com.quattroventi.trip.Core.Servizio.persistence;

import android.content.Context;

import com.quattroventi.trip.Model.Business.Cdp;

import java.util.List;

public class CdpAdapter extends GenericAdapter {
    protected CdpAdapter(Context context) {
        super(context);
    }

    public List<Cdp> getByViaggio() {
        return null;
    }//TODO getByViaggio (cdp))

    public Cdp getById() {
        return null;
    }//TODO getById (cdp))

    public List<Cdp> getByRotta() {
        return null;
    }//TODO getByRotta (cdp))

    public boolean update() {
        return false;
    }//TODO update (cdp))

    public boolean insert() {
        return false;
    }//TODO insert (cdp))
}
