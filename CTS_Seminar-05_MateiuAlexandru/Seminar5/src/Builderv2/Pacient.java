package Builderv2;

public class Pacient {
    private final boolean arePatRabatabil;
    private final boolean areMicDejun;
    private final boolean arePapuciCamera;
    private final boolean areHalat;
    private final String nume;

    protected Pacient() {
        this.arePatRabatabil = false;
        this.areMicDejun = false;
        this.arePapuciCamera = false;
        this.areHalat = false;
        this.nume = "anonim";
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
    public static class BuilderPacient{

    }
}
