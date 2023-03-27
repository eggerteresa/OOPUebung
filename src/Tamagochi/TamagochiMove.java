package Tamagochi;

public class TamagochiMove {


    int f;
    int y;
    int x;


    public void bewegen(String richtung) {

        if (f < 1) {
            System.out.println("Kein Futter mehr ");
            return;
        }

        switch (richtung) {
            case "oben":
                y++;
                break;
            case "unten":
                y--;
                break;
            case "links":
                x--;
                break;
            case "rechts":
                x++;
                break;
        }
        f = f - 1;
        System.out.println("x =" + x + " y = " + y);


    }

    public int futterstand(int f) {
        this.f = this.f +f;
        return f;
    }


//        if (f < 1) {
//
//
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Geben Sie Futter (positive ganze Zahl) ");
//            f = scanner.nextInt();
//
//        }return f;

}








