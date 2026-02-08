package com.example.uebungsprojekt.AutoArea;

public class Autohändler {

    public void printModelle() {
        Auto auto1 = new Auto("Stadtwagen", 50);
        Auto auto2 = new Auto("Schneller Flitzer", 150);
        Auto auto3 = new Auto("Geländewagen", 250);
        Taxi auto4 = new Taxi("Taxi klein", 101, 3, true, 3.5);
        Taxi auto5 = new Taxi("Taxi groß", 101, 8, false, 6.5);

        auto1.setName("Super Duper Auto");
        auto4.setName("Rainers Auto");

        System.out.println("Beispiel 1 Name: " + auto1.getName() + " Typ: " + auto1.getTyp() + " PS Zahl: " + auto1.getPsZahl());
        System.out.println("Beispiel 2 Name: " + auto2.getName() + " Typ: " + auto2.getTyp() + " PS Zahl: " + auto2.getPsZahl() + " hat Klima ? " + auto2.isHatKlima());
        System.out.println("Beispiel 3 Name: " + auto3.getName() + " Typ: " + auto3.getTyp() + " PS Zahl: " + auto3.getPsZahl() + " hat Klima ? " + auto3.isHatKlima());
        System.out.println("Beispiel 4 Name: " + auto4.getName() + " Typ: " + auto4.getTyp() + " PS Zahl: " + auto4.getPsZahl() + " hat Klima ? "
                + auto4.isHatKlima() + " Anzahl Passagiere: " + auto4.getAnzahlPassagiere() + " Preis pro Kilometer: " + auto4.getPreisProKilometer() + "Taxilicht an? " + auto4.isTaxiLicht());
        System.out.println("Beispiel 5 Name: " + auto5.getName() + " Typ: " + auto5.getTyp() + " PS Zahl: " + auto5.getPsZahl() + " hat Klima ? "
                + auto5.isHatKlima() + " Anzahl Passagiere: " + auto5.getAnzahlPassagiere() + " Preis pro Kilometer: " + auto5.getPreisProKilometer() + "Taxilicht an? " + auto5.isTaxiLicht());

    }
}
