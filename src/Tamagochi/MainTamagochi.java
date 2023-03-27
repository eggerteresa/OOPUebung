package Tamagochi;

public class MainTamagochi {
    public static void main(String[] args) {





            TamagochiMove tamagochiMove1 = new TamagochiMove();
        tamagochiMove1.x = 6;
        tamagochiMove1.y = 4;
        tamagochiMove1.f = 12;



            for (int i = 0; i < tamagochiMove1.f; i++) {
                if (tamagochiMove1.x!=0) {tamagochiMove1.bewegen("links");}
                if (tamagochiMove1.y!=0) {tamagochiMove1.bewegen("unten");}

                }
// muss noch wo x!=0, y!=0 einbauen als abbruchbedingung!!


    }
}
