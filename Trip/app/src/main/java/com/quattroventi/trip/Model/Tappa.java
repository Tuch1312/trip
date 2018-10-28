package com.quattroventi.trip.Model;

import java.util.LinkedList;
import java.util.List;

/**
 * Rappresenta una tappa del viaggio (ad Es. una città, un villaggio turistico, una località)
 */
public class Tappa extends Fermata {
    private LinkedList<Cdf> listaCoseDaFare;
    private LinkedList<PausaNotte> listaNotti;


    public Tappa() {
        listaCoseDaFare = new LinkedList<>();
        listaNotti = new LinkedList<>();
    }


    public LinkedList<Cdf> getListaCoseDaFare() {
        return listaCoseDaFare;
    }

    public void setListaCoseDaFare(LinkedList<Cdf> listaCoseDaFare) {
        this.listaCoseDaFare = listaCoseDaFare;
    }

    public LinkedList<PausaNotte> getListaNotti() {
        return listaNotti;
    }

    public void setListaNotti(LinkedList<PausaNotte> listaNotti) {
        this.listaNotti = listaNotti;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tappa tappa = (Tappa) o;

        if (listaCoseDaFare != null ? !listaCoseDaFare.equals(tappa.listaCoseDaFare) : tappa.listaCoseDaFare != null)
            return false;
        return listaNotti != null ? listaNotti.equals(tappa.listaNotti) : tappa.listaNotti == null;
    }

    @Override
    public int hashCode() {
        int result = listaCoseDaFare != null ? listaCoseDaFare.hashCode() : 0;
        result = 31 * result + (listaNotti != null ? listaNotti.hashCode() : 0);
        return result;
    }
}
