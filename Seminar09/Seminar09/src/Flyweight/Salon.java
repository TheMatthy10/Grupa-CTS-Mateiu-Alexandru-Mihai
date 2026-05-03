package Flyweight;

public class Salon {

    private float numarSalon;
    private int numarPat;
    private int numarZile;

    public Salon(float numarSalon, int numarPat, int numarZile) {
        this.numarSalon = numarSalon;
        this.numarPat = numarPat;
        this.numarZile = numarZile;
    }

    @Override
    public String toString() {
        return "Salon{" +
                "numarSalon=" + numarSalon +
                ", numarPat=" + numarPat +
                ", numarZile=" + numarZile +
                '}';
    }
}
