package Observer;

public class Pacient implements Observer{
    @Override
    public void primesteNotificarea(String mesaj) {
        System.out.println("Pacientul a primit mesaj");
    }
}
