package Singleton;

public class BazaDeDateLazy {
    private String denumire;
    private int numarCampuri;

    private static BazaDeDateLazy instanta = null;

    public static BazaDeDateLazy getInstanta(String denumire, int numarCampuri) {
        if (instanta == null) {
            instanta = new BazaDeDateLazy(denumire, numarCampuri)
        }
        return instanta;
    }


    private BazaDeDateLazy(String denumire, int campuri) {
        this.denumire = denumire;
        this.numarCampuri = numarCampuri;
    }
}
