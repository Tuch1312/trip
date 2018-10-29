package com.quattroventi.trip.Model.Servizio;

import com.quattroventi.trip.Utils.Constant;

import java.util.List;

public class MapsDirectionApiOption {

    boolean Alternative;
    List<Constant.DIRECTION_OPTION_EVITA> lista_limitazioni;
    Constant.DIRECTION_OPTION_MODE mezzo_usato;


    public boolean isAlternative() {
        return Alternative;
    }

    public void setAlternative(boolean alternative) {
        Alternative = alternative;
    }

    public List<Constant.DIRECTION_OPTION_EVITA> getLista_limitazioni() {
        return lista_limitazioni;
    }

    public void setLista_limitazioni(List<Constant.DIRECTION_OPTION_EVITA> lista_limitazioni) {
        this.lista_limitazioni = lista_limitazioni;
    }

    public Constant.DIRECTION_OPTION_MODE getMezzo_usato() {
        return mezzo_usato;
    }

    public void setMezzo_usato(Constant.DIRECTION_OPTION_MODE mezzo_usato) {
        this.mezzo_usato = mezzo_usato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MapsDirectionApiOption that = (MapsDirectionApiOption) o;

        if (Alternative != that.Alternative) return false;
        if (lista_limitazioni != null ? !lista_limitazioni.equals(that.lista_limitazioni) : that.lista_limitazioni != null)
            return false;
        return mezzo_usato == that.mezzo_usato;
    }

    @Override
    public int hashCode() {
        int result = (Alternative ? 1 : 0);
        result = 31 * result + (lista_limitazioni != null ? lista_limitazioni.hashCode() : 0);
        result = 31 * result + (mezzo_usato != null ? mezzo_usato.hashCode() : 0);
        return result;
    }
}
