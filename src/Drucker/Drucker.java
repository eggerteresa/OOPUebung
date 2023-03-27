package Drucker;

public class Drucker {

    private String zeichenkette;
    private int ganzezahl;
    private double fliesskommazahl;
    private boolean bool;

//    public Drucker(String zeichenkette, int ganzezahl, double fliesskommazahl, boolean bool) {
//        this.zeichenkette = zeichenkette;
//        this.ganzezahl = ganzezahl;
//        this.fliesskommazahl = fliesskommazahl;
//        this.bool = bool;
//    }
//



    public String getZeichenkette() {
        return zeichenkette;
    }

    public int getGanzezahl() {
        return ganzezahl;
    }

    public double getFliesskommazahl() {
        return fliesskommazahl;
    }

    public boolean isBool() {
        return bool;
    }

    public void setZeichenkette(String zeichenkette) {
        this.zeichenkette = zeichenkette;
    }

    public void setGanzezahl(int ganzezahl) {
        this.ganzezahl = ganzezahl;
    }

    public void setFliesskommazahl(double fliesskommazahl) {
        this.fliesskommazahl = fliesskommazahl;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }


    public void druckt(String zeichenkette) {
        System.out.println("Zeichenkette " + zeichenkette);

    }

    public void druckt(int ganzezahl) {
        System.out.println("Ganze Zahl " + ganzezahl);

    }
    public void druckt(double fliesskommazahl) {
        System.out.println("Fließkommazahl " +fliesskommazahl);

    }
    public void druckt(boolean bool) {
        System.out.println("Boolean " +bool);

    }




}
