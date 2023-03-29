package StatischeMethoden;

import java.util.Random;

public class Countdown {
    public static void main(String[] args) {

        countdown(10);
    }

        public static void countdown (int count) {
            if (count!=0) {
                System.out.println(count);
                count --;
                countdown(count);
            }
            else {
                System.out.println("Countdown finished!");


        }





    }
}
