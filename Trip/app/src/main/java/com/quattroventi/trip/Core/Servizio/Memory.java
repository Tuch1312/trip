package com.quattroventi.trip.Core.Servizio;

import com.quattroventi.trip.Model.Business.Viaggio;
import com.quattroventi.trip.Model.Servizio.mapsModel.DirectionsResult;

public class Memory {

    private static Memory istance;

    private Memory() {

    }

    public static Memory getInstance() {
        if (istance == null) {
            istance = new Memory();
        }

        return istance;
    }


    private Viaggio viaggioCorrente;

    private boolean awaitingDirectionResponse;

    private DirectionsResult directionsResult;


    public DirectionsResult getDirectionsResult() {
        return directionsResult;
    }

    public void setDirectionsResult(DirectionsResult directionsResult) {
        this.directionsResult = directionsResult;
    }

    public Viaggio getViaggioCorrente() {
        return viaggioCorrente;
    }

    public void setViaggioCorrente(Viaggio viaggioCorrente) {
        this.viaggioCorrente = viaggioCorrente;
    }

    public boolean isAwaitingDirectionResponse() {
        return awaitingDirectionResponse;
    }

    public void setAwaitingDirectionResponse(boolean awaitingDirectionResponse) {
        this.awaitingDirectionResponse = awaitingDirectionResponse;
    }
}
