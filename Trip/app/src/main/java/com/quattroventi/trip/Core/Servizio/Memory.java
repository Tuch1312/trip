package com.quattroventi.trip.Core.Servizio;

import com.quattroventi.trip.Model.Business.Viaggio;
import com.quattroventi.trip.Model.Servizio.mapsModel.DirectionsResult;

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

    private boolean awaitingDirectionResponse;

    private String response;


    public synchronized String getResponse() {
        return response;
    }

    public synchronized String getResponseOneTime() {
        String r = new String(response);
        response = null;
        return r;
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

    public synchronized boolean isAwaitingDirectionResponse() {
        return awaitingDirectionResponse;
    }

    public synchronized void setAwaitingDirectionResponse(boolean awaitingDirectionResponse) {
        this.awaitingDirectionResponse = awaitingDirectionResponse;
    }
}
