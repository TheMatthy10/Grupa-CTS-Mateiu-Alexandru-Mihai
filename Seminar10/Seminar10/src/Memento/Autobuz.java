package Memento;

public class Autobuz {
    private String model;
    private int anFabricatie;
    private int nrLocuri;
    private String numeSofer;
    private double consumMediu;

    public Autobuz(String model, int anFabricatie, int nrLocuri, String numeSofer, double consumMediu) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.nrLocuri = nrLocuri;
        this.numeSofer = numeSofer;
        this.consumMediu = consumMediu;
    }
    public AutobuzMemento salvareMemento(){
       return new AutobuzMemento(this.numeSofer,this.consumMediu);
    }
    public void restaurareMemento(AutobuzMemento memento){
        this.numeSofer = memento.getNumeSofer();
        this.consumMediu = memento.getConsumMediu();
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "model='" + model + '\'' +
                ", anFabricatie=" + anFabricatie +
                ", nrLocuri=" + nrLocuri +
                ", numeSofer='" + numeSofer + '\'' +
                ", consumMediu=" + consumMediu +
                '}';
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setConsumMediu(double consumMediu) {
        this.consumMediu = consumMediu;
    }
}
