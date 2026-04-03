package Singleton;

public class BazaDeDateStatic {
    private String denumire;
    private int numarCampuri;
    private static BazaDeDateStatic instanta;

    private static final BazaDeDateStatic instanta = new BazaDeDateStatic("Baza1", 2);

    public static BazaDeDateStatic getInstanta(){
        return instanta;
    }
    private BazaDeDateStatic(String denumire, int campuri){
        this.denumire = denumire;
        this.numarCampuri = numarCampuri;
}
