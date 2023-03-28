package Hausuebung5;

public class AutoTest {
    public static void main(String[] args) {

        Auto auto1 = new Auto("Toyota", "Camry", 2018);

        auto1.gasGeben(30);
        auto1.toString();
auto1.gasGeben(100);
        System.out.println("Nun kommt ein Reh auf die Fahrbahn, BREMSEN!");

auto1.bremsen(60);

        System.out.println(" -------- Zweites Auto --------- ");
Auto auto2 = new Auto("VW", "M550i", 2020);
auto2.toString();
auto2.geschwindigkeit = 100;
auto2.gasGeben(260);


    }
}
