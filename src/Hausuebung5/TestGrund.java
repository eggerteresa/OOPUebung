package Hausuebung5;

public class TestGrund {
    public static void main(String[] args) {
// Mehrdimensionalen Array erstellen - grundstücke mit verschiedenen Angaben

            int [] [] grundstuecke = {{ 1, 30, 40}, {2, 20, 50}, {3, 10, 30}};
// Klasse aufrufen
            Grundsteuer grundsteuer1 = new Grundsteuer();

            grundsteuer1.grundsteuerBerechnen(grundstuecke);

          //neue Variable Summe braucht man eigentlich nicht
        // double summe = grundsteuer1.grundsteuerBerechnen(grundstuecke);


    }
}



