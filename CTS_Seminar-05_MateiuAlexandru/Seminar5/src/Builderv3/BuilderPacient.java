package Builderv3;

public class BuilderPacient implements IBuilderPacient {
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean arePapuciCamera;
    private boolean areHalat;
    private String nume;



    public BuilderPacient() {
        this.arePatRabatabil = true;
        this.areMicDejun = true;
        this.arePapuciCamera = true;
        this.areHalat = true;
        this.nume = "anonim";
    }

    @Override
    public Pacient buildPacient() {
        return new Pacient(this.arePatRabatabil, this.areMicDejun, this.areHalat, this.arePapuciCamera);
    }

    @Override
    public IBuilderPacient setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
        return null;
    }

    @Override
    public IBuilderPacient setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
        return null;

    }

    @Override
    public IBuilderPacient setArePapuciCamera(boolean arePapuciCamera) {
        this.arePapuciCamera = arePapuciCamera;
        return null;
    }

    @Override
    public IBuilderPacient setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
        return null;
    }

    @Override
    public IBuilderPacient setNume(String nume) {
        this.setNume(nume);
        return null;
    }
}
