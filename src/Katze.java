import java.util.Scanner;

public class Katze {

    String name;
    int alter;
    String art;
    String farbe;

// kann publci Katze oder nur Katze stehen
    public Katze (String n, int a, String r, String c) { //Constuctor für die Klasse, zum schnelleren Eingeben in der Mainmethode
        name = n;
        art = r;
        alter = a;
        farbe = c;
    }


    public void katzeknurrt () {
        System.out.println("Die Katze schnurrt: ");
        System.out.println(" knurr ");


    }

    public void kannTrick () { //wäre auch möglich mit boolean

        System.out.println("Kann " + name + " einen Trick machen? Bitte j oder n eingeben: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.next().equals( "j") ) {
            System.out.println("Trick gelungen");
        }
        else {
            System.out.println("Trick nicht gelungen");
        }

    }

        public void gibInfo () {

            System.out.println(" Die Katze " + name + " ist " + alter + " Jahre alt und hat die Farbe " + farbe + " ihre Art ist " + art);
        }

}
