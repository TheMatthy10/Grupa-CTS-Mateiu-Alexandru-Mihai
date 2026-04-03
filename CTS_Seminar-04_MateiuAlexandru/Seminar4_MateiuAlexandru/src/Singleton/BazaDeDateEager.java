package Singleton;

public class BazaDeDateStatic {

    private String denumire;
    private int numarCampuri;

    private static final BazaDeDateEager instanta = new BazaDeDateEager("Baza1", 2);

    public static BazaDeDateEager getInstanta(){
        return instanta;
    }
    private BazaDeDateEager(String denumire, int campuri){
        this.denumire = denumire;
        this.numarCampuri = numarCampuri;
    }
}
