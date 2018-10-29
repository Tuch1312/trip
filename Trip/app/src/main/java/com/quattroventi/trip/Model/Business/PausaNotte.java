package com.quattroventi.trip.Model.Business;

import java.io.Serializable;


/**
 * Rappresenta una fermata di (generalmenete) 1 notte, senza particolare interesse per il luogo dove ci si ferma, è una tappa di necesità
 */
public class PausaNotte extends Fermata implements Serializable {
    private String webLink;
    private String indirizzo;

    public String getWebLink() {
        return webLink;
    }

    public void setWebLink(String webLink) {
        this.webLink = webLink;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PausaNotte that = (PausaNotte) o;

        if (webLink != null ? !webLink.equals(that.webLink) : that.webLink != null) return false;
        return indirizzo != null ? indirizzo.equals(that.indirizzo) : that.indirizzo == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (webLink != null ? webLink.hashCode() : 0);
        result = 31 * result + (indirizzo != null ? indirizzo.hashCode() : 0);
        return result;
    }
}


