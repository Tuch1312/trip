package com.quattroventi.trip.Core.Servizio.persistence;

import android.content.Context;

import com.quattroventi.trip.Model.Business.Cdp;
import com.quattroventi.trip.Model.Business.PausaNotte;

import java.util.List;

public class PausaNotteAdapter extends GenericAdapter {
    protected PausaNotteAdapter(Context context) {
        super(context);
    }


    public List<PausaNotte> getByViaggio() {return null;}//TODO getByViaggio (pausaNotte))
    public PausaNotte getById() {return null;}//TODO getById (pausaNotte))
    public List<PausaNotte> getByRotta() {return null;}//TODO getByRotta (pausaNotte))
    public List<PausaNotte> getByTappa() {return null;}//TODO getByTappa (pausaNotte))
    public boolean update() {return false;}//TODO update (pausaNotte))
    public boolean insert() {return false;}//TODO insert (pausaNotte))
}
