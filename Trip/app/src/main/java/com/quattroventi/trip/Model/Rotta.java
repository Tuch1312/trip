package com.quattroventi.trip.Model;

import com.google.android.gms.maps.model.Polyline;

import java.io.Serializable;
import java.util.LinkedList;

/**
 * Rappresenta una "linea" (strada) tra una tappa ed un altra
 */
public class Rotta implements Serializable {

    private Tappa partenza;
    private Tappa arrivo;
    private Float distanza;
    private float tempoPrevistoPercorennza;
    private Polyline tracciato;
    private float costoCarburante;
    private float costoAutostrada;
    private LinkedList<Cdp> ListaSpeseExtra;
    private int seqRotta;
    private String ID;


    public Tappa getPartenza() {
        return partenza;
    }

    public void setPartenza(Tappa partenza) {
        this.partenza = partenza;
    }

    public Tappa getArrivo() {
        return arrivo;
    }

    public void setArrivo(Tappa arrivo) {
        this.arrivo = arrivo;
    }

    public Float getDistanza() {
        return distanza;
    }

    public void setDistanza(Float distanza) {
        this.distanza = distanza;
    }

    public float getTempoPrevistoPercorennza() {
        return tempoPrevistoPercorennza;
    }

    public void setTempoPrevistoPercorennza(float tempoPrevistoPercorennza) {
        this.tempoPrevistoPercorennza = tempoPrevistoPercorennza;
    }

    public Polyline getTracciato() {
        return tracciato;
    }

    public void setTracciato(Polyline tracciato) {
        this.tracciato = tracciato;
    }

    public float getCostoCarburante() {
        return costoCarburante;
    }

    public void setCostoCarburante(float costoCarburante) {
        this.costoCarburante = costoCarburante;
    }

    public float getCostoAutostrada() {
        return costoAutostrada;
    }

    public void setCostoAutostrada(float costoAutostrada) {
        this.costoAutostrada = costoAutostrada;
    }

    public int getSeqRotta() {
        return seqRotta;
    }

    public void setSeqRotta(int seqRotta) {
        this.seqRotta = seqRotta;
    }

    public LinkedList<Cdp> getListaSpeseExtra() {
        return ListaSpeseExtra;
    }

    public void setListaSpeseExtra(LinkedList<Cdp> listaSpeseExtra) {
        ListaSpeseExtra = listaSpeseExtra;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rotta rotta = (Rotta) o;

        if (Float.compare(rotta.tempoPrevistoPercorennza, tempoPrevistoPercorennza) != 0)
            return false;
        if (Float.compare(rotta.costoCarburante, costoCarburante) != 0) return false;
        if (Float.compare(rotta.costoAutostrada, costoAutostrada) != 0) return false;
        if (seqRotta != rotta.seqRotta) return false;
        if (partenza != null ? !partenza.equals(rotta.partenza) : rotta.partenza != null)
            return false;
        if (arrivo != null ? !arrivo.equals(rotta.arrivo) : rotta.arrivo != null) return false;
        if (distanza != null ? !distanza.equals(rotta.distanza) : rotta.distanza != null)
            return false;
        if (tracciato != null ? !tracciato.equals(rotta.tracciato) : rotta.tracciato != null)
            return false;
        return ListaSpeseExtra != null ? ListaSpeseExtra.equals(rotta.ListaSpeseExtra) : rotta.ListaSpeseExtra == null;
    }

    @Override
    public int hashCode() {
        int result = partenza != null ? partenza.hashCode() : 0;
        result = 31 * result + (arrivo != null ? arrivo.hashCode() : 0);
        result = 31 * result + (distanza != null ? distanza.hashCode() : 0);
        result = 31 * result + (tempoPrevistoPercorennza != +0.0f ? Float.floatToIntBits(tempoPrevistoPercorennza) : 0);
        result = 31 * result + (tracciato != null ? tracciato.hashCode() : 0);
        result = 31 * result + (costoCarburante != +0.0f ? Float.floatToIntBits(costoCarburante) : 0);
        result = 31 * result + (costoAutostrada != +0.0f ? Float.floatToIntBits(costoAutostrada) : 0);
        result = 31 * result + (ListaSpeseExtra != null ? ListaSpeseExtra.hashCode() : 0);
        result = 31 * result + seqRotta;
        return result;
    }
}