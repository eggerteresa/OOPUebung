package Hausuebung5;

public class Grundsteuer {

    public double grundsteuerBerechnen (int [] [] grundstuecke) { // dadurch dass es eine Methode ist, kann ich es an die Mainmethode übergeben
double summe = 0;
       // for loop, damit wir grundstücke * Steuer berechnen können
for (int [] grundstueck : grundstuecke) { // for each loop äußerer array, innerer array

    int typ = grundstueck [0];
    int laenge = grundstueck [1];
    int breite = grundstueck [2];
    double flaeche = laenge*breite;
    double steuer = 0;

    // 3 Typen zur Auswahl stellen
    switch (typ) {
        case 1:
            steuer = flaeche*3.20;
            break;
        case 2:
            steuer = flaeche*2.10;
            break;
        case 3:
            steuer = flaeche*0.9;
    }
    summe = summe + steuer;



}


        System.out.println("Die Summe der Grundsteuer beträgt " + summe);



return summe; // return wert für Methode
    }
}

