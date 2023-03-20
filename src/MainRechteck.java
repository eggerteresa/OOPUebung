public class MainRechteck {
    public static void main(String[] args) {

        //Objekt erstellen
        Rechteck rechteck1 = new Rechteck(10.5, 4.8); //Konstruktor nur dafür notwendig
        rechteck1.getArea();
        rechteck1.getPerimeter();
        System.out.println("Berechnen der Fläche " + rechteck1.getArea());
        System.out.println("Berechnen des Umfangs " +rechteck1.getPerimeter());


        rechteck1.setLaenge(5);
        rechteck1.setBreite(20);
        System.out.println(" Welcher Wert bei laenge? " + rechteck1.getLaenge());
        rechteck1.getArea();
        System.out.println("Berechnen der neuen Fläche ist " + rechteck1.getArea());

//        //Werte holen mit getter Methode
//        rechteck1.getBreite();
//        rechteck1.getLaenge();
//
//        //anderen Wert mit Setter Methode
//        double breite = rechteck1.setBreite();
//        double laenge = rechteck1.setLaenge();



    }



}
