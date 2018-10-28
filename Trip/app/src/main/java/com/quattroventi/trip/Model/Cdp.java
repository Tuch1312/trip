package com.quattroventi.trip.Model;

import com.google.android.gms.maps.model.LatLng;

import java.io.Serializable;
import java.util.Date;

/**
 * CDP : Cosa da pagare, rappresenta unaqualsiasi cosa da pagare extra durante la starada (tasse, imbarcazioni, permessi, passagi)
 */
public class Cdp implements Serializable {

    private LatLng cooridinata;
    private String indirizzo;
    private String nome;
    private String descrizione;
    private boolean obbligatorio;
    private Date data;
    private float Costo;
    private String ID;

    public LatLng getCooridinata() {
        return cooridinata;
    }

    public void setCooridinata(LatLng cooridinata) {
        this.cooridinata = cooridinata;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public boolean isObbligatorio() {
        return obbligatorio;
    }

    public void setObbligatorio(boolean obbligatorio) {
        this.obbligatorio = obbligatorio;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getCosto() {
        return Costo;
    }

    public void setCosto(float costo) {
        Costo = costo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cdp cdp = (Cdp) o;

        if (obbligatorio != cdp.obbligatorio) return false;
        if (Float.compare(cdp.Costo, Costo) != 0) return false;
        if (cooridinata != null ? !cooridinata.equals(cdp.cooridinata) : cdp.cooridinata != null)
            return false;
        if (indirizzo != null ? !indirizzo.equals(cdp.indirizzo) : cdp.indirizzo != null)
            return false;
        if (nome != null ? !nome.equals(cdp.nome) : cdp.nome != null) return false;
        if (descrizione != null ? !descrizione.equals(cdp.descrizione) : cdp.descrizione != null)
            return false;
        return data != null ? data.equals(cdp.data) : cdp.data == null;
    }

    @Override
    public int hashCode() {
        int result = cooridinata != null ? cooridinata.hashCode() : 0;
        result = 31 * result + (indirizzo != null ? indirizzo.hashCode() : 0);
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (descrizione != null ? descrizione.hashCode() : 0);
        result = 31 * result + (obbligatorio ? 1 : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (Costo != +0.0f ? Float.floatToIntBits(Costo) : 0);
        return result;
    }
}
