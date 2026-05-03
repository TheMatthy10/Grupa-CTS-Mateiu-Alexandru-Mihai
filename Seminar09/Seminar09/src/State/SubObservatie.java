package State;

public class SubObservatie implements Stari{
    public void interneaza(){
        System.out.println("Pacientul este deja internat");
    }
    public void trecereSubObservatie(){
        System.out.println("Pacientul a fost trecut sub observatie");
    }
    public void externeaza(){
        System.out.println("Pacientul va fi externat");
    }
}
