package com.quattroventi.trip.Core.Servizio;

import com.quattroventi.trip.Model.Business.Tappa;
import com.quattroventi.trip.Model.Business.Viaggio;

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

    public Viaggio getViaggioCorrente() {
        return viaggioCorrente;
    }

    public void setViaggioCorrente(Viaggio viaggioCorrente) {
        this.viaggioCorrente = viaggioCorrente;
    }
}
