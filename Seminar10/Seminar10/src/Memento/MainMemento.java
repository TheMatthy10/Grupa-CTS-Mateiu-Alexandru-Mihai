package Memento;

public class MainMemento {
    static void main(){
        Autobuz a1 = new Autobuz("model1", 1997, 58, "Vasile", 12.5);

        System.out.println(a1);

        AutobuzMemento autobuzMemento = a1.salvareMemento();
        a1.setNumeSofer("Ana");
        a1.setConsumMediu(13.1);

        System.out.println(a1);
        a1.restaurareMemento(autobuzMemento);
        System.out.println(a1);
    }
}
