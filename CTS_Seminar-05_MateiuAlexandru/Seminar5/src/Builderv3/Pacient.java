package Builderv3;

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


        public Pacient buildPacient() {
            return new Pacient(this.arePatRabatabil, this.areMicDejun, this.areHalat, this.arePapuciCamera);
        }


        public BuilderPacient setArePatRabatabil(boolean arePatRabatabil) {
            this.arePatRabatabil = arePatRabatabil;
            return null;
        }


        public BuilderPacient setAreMicDejun(boolean areMicDejun) {
            this.areMicDejun = areMicDejun;
            return null;

        }


        public BuilderPacient setArePapuciCamera(boolean arePapuciCamera) {
            this.arePapuciCamera = arePapuciCamera;
            return null;
        }


        public BuilderPacient setAreHalat(boolean areHalat) {
            this.areHalat = areHalat;
            return null;
        }


        public BuilderPacient setNume(String nume) {
            this.setNume(nume);
            return null;
        }
    }
}
