package com.quattroventi.trip.Model;

import com.google.android.gms.maps.model.LatLng;
import com.quattroventi.trip.Utils.Constant;

import java.io.Serializable;
import java.util.Date;


/**
 * Elemento di base che rappresenta una sosta da qualche parte di qualche tipo
 */
public class Fermata implements Serializable {
   private LatLng coordinate;
    /**
     * la durata èespressa in intero e "l'unita di misura" di questo numero è definita da <code>tipoDurata</code>
     */
   private int durataSosta;
   private Date oraArrivo;
   private Date oraPartenza;
   private String nome;
   private String descrizione;
   private String note;
   private Constant.TIPO_DURATA tipoDurata;
    /**
     * Numero della notte dalla partenza del viaggio (la prima notte è 1)
     */
   private int seqNotte;
   private float costo;

    public LatLng getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(LatLng coordinate) {
        this.coordinate = coordinate;
    }

    public int getDurataSosta() {
        return durataSosta;
    }

    public void setDurataSosta(int durataSosta) {
        this.durataSosta = durataSosta;
    }

    public Date getOraArrivo() {
        return oraArrivo;
    }

    public void setOraArrivo(Date oraArrivo) {
        this.oraArrivo = oraArrivo;
    }

    public Date getOraPartenza() {
        return oraPartenza;
    }

    public void setOraPartenza(Date oraPartenza) {
        this.oraPartenza = oraPartenza;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Constant.TIPO_DURATA getTipoDurata() {
        return tipoDurata;
    }

    public void setTipoDurata(Constant.TIPO_DURATA tipoDurata) {
        this.tipoDurata = tipoDurata;
    }

    public int getSeqNotte() {
        return seqNotte;
    }

    public void setSeqNotte(int seqNotte) {
        this.seqNotte = seqNotte;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fermata fermata = (Fermata) o;

        if (durataSosta != fermata.durataSosta) return false;
        if (seqNotte != fermata.seqNotte) return false;
        if (Float.compare(fermata.costo, costo) != 0) return false;
        if (coordinate != null ? !coordinate.equals(fermata.coordinate) : fermata.coordinate != null)
            return false;
        if (oraArrivo != null ? !oraArrivo.equals(fermata.oraArrivo) : fermata.oraArrivo != null)
            return false;
        if (oraPartenza != null ? !oraPartenza.equals(fermata.oraPartenza) : fermata.oraPartenza != null)
            return false;
        if (nome != null ? !nome.equals(fermata.nome) : fermata.nome != null) return false;
        if (descrizione != null ? !descrizione.equals(fermata.descrizione) : fermata.descrizione != null)
            return false;
        if (note != null ? !note.equals(fermata.note) : fermata.note != null) return false;
        return tipoDurata == fermata.tipoDurata;
    }

    @Override
    public int hashCode() {
        int result = coordinate != null ? coordinate.hashCode() : 0;
        result = 31 * result + durataSosta;
        result = 31 * result + (oraArrivo != null ? oraArrivo.hashCode() : 0);
        result = 31 * result + (oraPartenza != null ? oraPartenza.hashCode() : 0);
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (descrizione != null ? descrizione.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (tipoDurata != null ? tipoDurata.hashCode() : 0);
        result = 31 * result + seqNotte;
        result = 31 * result + (costo != +0.0f ? Float.floatToIntBits(costo) : 0);
        return result;
    }
}
