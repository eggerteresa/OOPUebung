package Rechteck;

import java.util.Scanner;

public class Rechteck {

// Variablen private festlegen
    private double breite;
    private double laenge ;


    //Constructor erstellen:
   Rechteck(double b, double l) {
    breite = b;
    laenge = l;

    }

    //Liefert Variablenwerte Gettermethode, NUR Variable zurückgeben
    public double getBreite() { return breite;}

    public double getLaenge() {return laenge;}


    public void setBreite (double breite) {
       this.breite = breite;

    }

    public void setLaenge (double laenge) {
       this.laenge = laenge;
    }
    public double getArea () {
        double area = laenge * breite;
       // System.out.println("Die Fläche des Rechtecks beträgt " + area);
        return area;

    }

    public double getPerimeter () {
        double perimeter = (2* (laenge + breite));
      //  System.out.println("Der umfang ist " + perimeter);
        return perimeter;

    }


//    public void setBreite (double breite) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Geben Sie die Breite ein: ");
//        breite = scanner.nextDouble();

   // }

//    public void setLaenge( double laenge) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Geben Sie die Länge ein: ");
//        laenge = scanner.nextDouble();
//
//    }

//    public double getBreite(double breite) {
//
//
//        System.out.println("Die Breite ist" + breite);
//        return breite;
//    }
//
//    public double getLaenge (double laenge) {
//
//        System.out.println("Die Länge ist" +laenge);
//
//        return laenge;
//
//    }









}
