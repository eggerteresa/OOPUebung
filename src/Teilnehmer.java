public class Teilnehmer {

    String name;
    int alter;
    char geschlecht;
    int fragenCounter = 0;

    //wieviele Fragen wurden gestellt?
    public void hatFrageGestellt () {
        fragenCounter ++;
        System.out.println("Ich war in  Methode hat FrageGestellt");

    }




}
