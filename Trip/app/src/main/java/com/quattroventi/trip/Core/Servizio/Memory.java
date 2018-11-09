package com.quattroventi.trip.Core.Servizio;

import com.google.android.gms.maps.GoogleMap;
import com.quattroventi.trip.Model.Business.Viaggio;
import com.quattroventi.trip.Model.Servizio.mapsModel.DirectionsResult;
import com.quattroventi.trip.Model.Servizio.mapsModel.DirectionsRoute;

import java.util.List;

public class Memory {

    private static Memory istance;

    private Memory() {

    }

    public static synchronized Memory getInstance() {
        if (istance == null) {
            istance = new Memory();
        }

        return istance;
    }


    private Viaggio viaggioCorrente;

    private String response;

    private List<DirectionsRoute> utilmeRotteSelezionate;
    private DirectionsRoute rottaSelezionata;
    private GoogleMap selectedMap;


    public synchronized String getResponse() {
        return response;
    }


    public synchronized void  setResponse(String response) {
        this.response = response;
    }

    public synchronized Viaggio getViaggioCorrente() {
        return viaggioCorrente;
    }

    public synchronized void setViaggioCorrente(Viaggio viaggioCorrente) {
        this.viaggioCorrente = viaggioCorrente;
    }

    public synchronized List<DirectionsRoute> getUtilmeRotteSelezionate() {
        return utilmeRotteSelezionate;
    }

    public synchronized void setUtilmeRotteSelezionate(List<DirectionsRoute> utilmeRotteSelezionate) {
        this.utilmeRotteSelezionate = utilmeRotteSelezionate;
    }

    public synchronized DirectionsRoute getRottaSelezionata() {
        return rottaSelezionata;
    }

    public synchronized void setRottaSelezionata(DirectionsRoute rottaSelezionata) {
        this.rottaSelezionata = rottaSelezionata;
    }

    public synchronized GoogleMap getSelectedMap() {
        return selectedMap;
    }

    public synchronized void setSelectedMap(GoogleMap selectedMap) {
        this.selectedMap = selectedMap;
    }
}
