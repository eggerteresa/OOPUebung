package Hausuebung5;

import javax.swing.text.StringContent;
import java.util.Locale;

public class Rezept {

    private int anzahlPersonen = 2;

    String[] zutatenName;
    double[][] zutaten;

    public Rezept(int anzahlPersonen, String[] zutatenName, double[][] zutaten) {
        this.anzahlPersonen = anzahlPersonen;
        this.zutatenName = zutatenName;
        this.zutaten = zutaten;
    }



    public boolean allergisch(String zutat) {
        boolean zutatimRezept = false;

        for (int i = 0; i < zutatenName.length; i++) {
            if (zutatenName[i].contains(zutat)) {
             //   System.out.println("Achtung, die Zutat ist im Rezept enthalten!");
                zutatimRezept = true;
            } //else {
             //  System.out.println("Die Zutat ist nicht enthalten, Rezept ist unbedenklich.");
            //}
        }
        return zutatimRezept;
    }

    public boolean laktoseFrei() {

        boolean removed = false;

        for (int i = 0; i < zutatenName.length; i++) {
            String name = zutatenName[i].toLowerCase();
            if (name.contains("milch") || name.contains("kaese") ) {
                zutaten [i] [0] = 0; // Damit wir den Platz im Array erwischen - und dort alle Werte auf Null setzen!
                zutaten [i] [1] = 0;
                removed = true;
            }
        }
        return removed;
    }

public double kostet () {
        double summe = 0;

        for ( int i = 0; i< zutaten.length; i++) { // Alle Kosten (dh im Array stelle 1) zusammenrechnen
            summe = summe + zutaten [i] [1];
        }
 return summe;
}

    public double kostetProPerson () {
        double kostenProPerson = 0;
        double summe = 0;

        for ( int i = 0; i< zutaten.length; i++) { // Alle Kosten (dh im Array stelle 1) zusammenrechnen
             summe= summe + zutaten [i] [1];
             kostenProPerson = summe /anzahlPersonen;

        }
        return kostenProPerson;
    }

public void aenderePersonen(int anzahl) {

        for ( int i = 0 ; i< zutaten.length; i++) {

            if (anzahl >0) {
                zutaten[i][0] = (zutaten[i][0]/anzahlPersonen*anzahl);
                zutaten[i][1] = zutaten [i] [1] /anzahlPersonen*anzahl;
            }
            anzahlPersonen = anzahl;


        }

}

    public int getAnzahlPersonen() {
        return anzahlPersonen;
    }

    public void setAnzahlPersonen(int anzahlPersonen) {
        this.anzahlPersonen = anzahlPersonen;
    }




}
