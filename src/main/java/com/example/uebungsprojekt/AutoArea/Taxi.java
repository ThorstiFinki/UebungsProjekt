package com.example.uebungsprojekt.AutoArea;

public class Taxi extends Auto {



    private int anzahlPassagiere;
    private double preisProKilometer;
    private boolean taxiLicht;

    public Taxi(String typ, int pS, int anzahlPassagiere, boolean taxiLicht, double preisProKilometer) {
        super(typ, pS);
        this.anzahlPassagiere = anzahlPassagiere;
        this.taxiLicht = taxiLicht;
        this.preisProKilometer = preisProKilometer;
    }

    public int getAnzahlPassagiere() {
        return anzahlPassagiere;
    }

    public double getPreisProKilometer() {
        return preisProKilometer;
    }

    public boolean isTaxiLicht() {
        return taxiLicht;
    }
}