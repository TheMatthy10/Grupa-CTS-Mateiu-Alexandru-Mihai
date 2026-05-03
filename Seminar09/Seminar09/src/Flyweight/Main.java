package Flyweight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
     static void main() {
        Salon salon1 = new Salon(1, 10, 7);
        Salon salon2 = new Salon(12.1f, 12, 8);
        Salon salon3= new Salon(15.5f, 7, 10);

        Flyweight pacient = PacientFlyweightFactory.getFlyweight("Mihai", "0765857686", "Strada Principala");
        pacient.afisareDetaliiInternare(salon1);
        pacient.afisareDetaliiInternare(salon2);
        pacient.afisareDetaliiInternare(salon3);
        }
    }
