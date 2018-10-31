package com.quattroventi.trip.Core.Servizio.persistence;

import android.content.Context;

import com.quattroventi.trip.Model.Business.Cdf;

import java.util.List;

public class CdfAdapter extends GenericAdapter {
    protected CdfAdapter(Context context) {
        super(context);
    }


    public List<Cdf> getByViaggio() {return null;}//TODO getByViaggio (cdf))
    public Cdf getById() {return null;}//TODO getById (cdf))
    public List<Cdf> getBytappa() {return null;}//TODO getByTappa (cdf))
    public boolean update() {return false;}//TODO update (cdf))
    public boolean insert() {return false;}//TODO insert (cdf))
}
