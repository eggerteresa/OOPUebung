package HausuebungQuader;

public class Grundsteuer {

    public static double grundsteuerBerechnen (int [] [] grundstuecke) {
double summe = 0;
       // ist Methode
for (int [] grundstueck : grundstuecke) { // for each loop äußerer array, innerer array
    int typ = grundstueck [0];
    int laenge = grundstueck [1];
    int breite = grundstueck [2];
    double flaeche = laenge*breite;
    double steuer = 0;
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
}





return summe;
    }
}

