package HausuebungQuader;

public class Quader {

    double laenge;
    double breite;
    double hoehe;
    double faktor;

    public Quader(double laenge, double breite, double hoehe) {
        this.laenge = laenge;
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public double getLaenge() {
        return laenge;
    }

    public double getBreite() {
        return breite;
    }

    public double getHoehe() {
        return hoehe;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public void setHoehe() {
        this.hoehe = hoehe;
    }

    public void grundflaeche () {
        double flaeche = laenge*breite;
        System.out.println(" Die Fläche ist " + flaeche);

    }

    public void skaliere (double faktor) {

        this.laenge = laenge*faktor;
        this.breite = breite*faktor;
        this.hoehe = hoehe*faktor;

    }

public void volumen () {
        double volumen = laenge*breite*hoehe;
    System.out.println("Das Volumen beträgt " + volumen);


}
public void oberflaeche () {
        double oberflaeche = (2* laenge*breite) + (2* laenge*hoehe) + (2*breite*hoehe);
    System.out.println("Die Oberfläche beträgt "+ oberflaeche);
}




}
