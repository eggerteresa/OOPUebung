package Hausuebung5;

public class RezeptApp {
    public static void main(String[] args) {

        // DA funktionieren noch ein paar Dinge nicht!!!

        String [] zutatenName = {"Nudeln", "Tomatensoße", "Milch", "Parmesan"};

        double [] [] zutaten = {{300, 1.0}, {100, 2.0}, {50, 0.5} ,{25, 1.5}};



        Rezept rezept1 = new Rezept(4, zutatenName, zutaten);

        System.out.println(" Ist das Rezept allergen gegen Milch? " + rezept1.allergisch("Milch"));
        System.out.println(" Ist das Rezept allergen gegen Eier? " + rezept1.allergisch("Eier"));
        System.out.println("Das Rezept kostet "+ rezept1.kostet());
        System.out.println("Die Kosten pro Person sind " + rezept1.kostetProPerson());
        System.out.println(" Rezept lakotosefrei  " +  rezept1.laktoseFrei());
        rezept1.aenderePersonen(7);
        System.out.println("Rezept für wieviele Personen: " + rezept1.getAnzahlPersonen());
        System.out.println("DAs Rezept kostet pro Person " + rezept1.kostetProPerson());


    }
}
