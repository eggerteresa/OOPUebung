package StatischeMethoden;

public class Fakultaetberechnen {
    public static void main(String[] args) {
        System.out.println(fakultaet(5));

    }

        public static int fakultaet (int zahl) {

            if (zahl ==0) {
                return 1;}
                else {
                    return zahl * fakultaet(zahl-1);}
        }

}
