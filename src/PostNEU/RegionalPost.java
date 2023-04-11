package PostNEU;



public class RegionalPost {
    public static void main(String[] args) {





// wir erstellen zwei neue Filialen, eine in Kalsdorf, eine in Graz
        FilialPost filiale1 = new FilialPost( "Filiale Kalsdorf", 10);
        FilialPost filiale2 = new FilialPost("Filiale Graz", 15);


        Paket paket1 = new Paket(2, "Grazergasse 1, 8010 Graz");
filiale1.paketHinzufuegen(paket1);
//zwei neue pakete an filiale graz
        filiale2.paketHinzufuegen(new Paket(32, "GrazerStraße 27"));
        filiale2.paketHinzufuegen(new Paket (54, "Koerblergasse 123"));

        System.out.println("\n Das Array mit allen darin befindlichen Objekten bzw. REferenzen anzeigen");
filiale1.paketeAnzeigen();
filiale2.paketeAnzeigen();


        System.out.println("Alle Paketdetails anzeigen");
filiale1.paketDetails(0);
filiale2.paketDetails(1);


        System.out.println("Paket mit ID 2 im Array scuhen und löschen");
filiale1.paketEntfernen(2);
filiale1.paketeAnzeigen();
    }
}
