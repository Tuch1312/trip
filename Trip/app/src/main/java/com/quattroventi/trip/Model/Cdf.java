package com.quattroventi.trip.Model;

import java.io.Serializable;

/**
 * CDF : Cosa Da Fare, qualsiasi attività/attrazione che si voglia aggiungere al viaggio
 */
public class Cdf extends Fermata implements Serializable {

    /**
     * Eventuale link ad un sito web
     */
    private String webLink;
    /**
     * Guidizio da 0 a 5 su quanto sia indepensabile fare quest'attività/attrazione per il viaggio
     * A UI rappresentato con le stelline di rating
     */
    private int importanza;

    public String getWebLink() {
        return webLink;
    }

    public void setWebLink(String webLink) {
        this.webLink = webLink;
    }

    public int getImportanza() {
        return importanza;
    }

    public void setImportanza(int importanza) {
        this.importanza = importanza;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cdf cdf = (Cdf) o;

        if (importanza != cdf.importanza) return false;
        return webLink != null ? webLink.equals(cdf.webLink) : cdf.webLink == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (webLink != null ? webLink.hashCode() : 0);
        result = 31 * result + importanza;
        return result;
    }
}
