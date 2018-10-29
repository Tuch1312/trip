package com.quattroventi.trip.Model.Business;

import java.util.LinkedList;

public class Viaggio {
    private LinkedList<Tappa> listaTappe;
    private LinkedList<Rotta> listaRotte;
    private String nome;
    private String descrzione;
    private String note;
    private Ppa partenza;
    private Ppa arrivo;
    private float costo;
    private String ID;

    public LinkedList<Tappa> getListaTappe() {
        return listaTappe;
    }

    public void setListaTappe(LinkedList<Tappa> listaTappe) {
        this.listaTappe = listaTappe;
    }

    public LinkedList<Rotta> getListaRotte() {
        return listaRotte;
    }

    public void setListaRotte(LinkedList<Rotta> listaRotte) {
        this.listaRotte = listaRotte;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrzione() {
        return descrzione;
    }

    public void setDescrzione(String descrzione) {
        this.descrzione = descrzione;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Ppa getPartenza() {
        return partenza;
    }

    public void setPartenza(Ppa partenza) {
        this.partenza = partenza;
    }

    public Ppa getArrivo() {
        return arrivo;
    }

    public void setArrivo(Ppa arrivo) {
        this.arrivo = arrivo;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
