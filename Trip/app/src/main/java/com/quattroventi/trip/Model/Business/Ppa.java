package com.quattroventi.trip.Model.Business;

import com.google.android.gms.maps.model.LatLng;

import java.util.Date;

/**
 * Punto di partenza/arrivo, rappresenta la partenza e l'arrivo del viaggio. un punto sulla mappa con collegata solo una linea
 */

public class Ppa {
    private LatLng coordinate;
    private String nome;
    private String descrizione;
    private String indirizzo;
    private Date oraPartenzaArrivo;
    private String ID;

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public LatLng getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(LatLng coordinate) {
        this.coordinate = coordinate;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public Date getOraPartenzaArrivo() {
        return oraPartenzaArrivo;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setOraPartenzaArrivo(Date oraPartenzaArrivo) {
        this.oraPartenzaArrivo = oraPartenzaArrivo;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ppa ppa = (Ppa) o;

        if (coordinate != null ? !coordinate.equals(ppa.coordinate) : ppa.coordinate != null)
            return false;
        if (nome != null ? !nome.equals(ppa.nome) : ppa.nome != null) return false;
        if (indirizzo != null ? !indirizzo.equals(ppa.indirizzo) : ppa.indirizzo != null)
            return false;
        if (descrizione != null ? !descrizione.equals(ppa.indirizzo) : ppa.descrizione != null)
            return false;
        return oraPartenzaArrivo != null ? oraPartenzaArrivo.equals(ppa.oraPartenzaArrivo) : ppa.oraPartenzaArrivo == null;
    }

    @Override
    public int hashCode() {
        int result = coordinate != null ? coordinate.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (indirizzo != null ? indirizzo.hashCode() : 0);
        result = 31 * result + (oraPartenzaArrivo != null ? oraPartenzaArrivo.hashCode() : 0);
        result = 31 * result + (descrizione != null ? descrizione.hashCode() : 0);
        return result;
    }
}
