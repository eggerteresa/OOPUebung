package StatischeMethoden;

public class MatheRechner {

    public static int addition (int a, int b) {
        int summe =0;

         summe = a+b;
        System.out.println("Die Summe ist " + summe);

        return summe; // man kann auch gleich direkt schreiben: return=a+b;
    }


    public static int subtraktion (int a, int b) {

        int neuerwert = 0;
        neuerwert = a - b;
        System.out.println("Das Ergebnis der Subtraktion ist "+ neuerwert);
        return neuerwert;
    }


    public static int multiplikation (int a, int b) {
        int multiplikat = a*b;
        System.out.println("Das Ergebnis der Multiplikation ist " + multiplikat);
        return multiplikat;

    }

    public static int division (int a, int b) {

        int divisi = a/b;
        System.out.println("Das Ergebnis der Division ist " + divisi);
        return divisi;
    }

}
