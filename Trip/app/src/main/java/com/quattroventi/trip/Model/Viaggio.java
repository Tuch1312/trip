package com.quattroventi.trip.Model;

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
}
