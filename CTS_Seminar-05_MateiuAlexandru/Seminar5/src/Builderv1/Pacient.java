package Builderv1;

public class Pacient {
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean arePapuciCamera;
    private boolean areHalat;
    private String nume;

    public Pacient(boolean arePatRabatabil, boolean areMicDejun, boolean arePapuciCamera, boolean areHalat, String nume) {
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejun = areMicDejun;
        this.arePapuciCamera = arePapuciCamera;
        this.areHalat = areHalat;
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "arePatRabatabil=" + arePatRabatabil +
                ", areMicDejun=" + areMicDejun +
                ", arePapuciCamera=" + arePapuciCamera +
                ", areHalat=" + areHalat +
                ", nume='" + nume + '\'' +
                '}';
    }
}
