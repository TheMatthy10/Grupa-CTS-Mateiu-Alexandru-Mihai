package Command;

public class Medic {
    private String name;

    public void internarePacient(){
        System.out.println("Internare pacient");
    }

    public void tratareImediata(){
        System.out.println("Tratare imediata");
    }

    public Medic(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void anuleazaInternarePacient() {
        System.out.println("Anuleaza internare pacient ");
    }
    public void anuleazaTratareImediata() {
        System.out.println("Anuleaza tratare imediata ");
    }
    public void refaceInternarePacient(){
        System.out.println("Reface internare pacient.");
    }
    public void refaceTratareImediata() {
        System.out.println("RefaceS tratare imediata ");
    }
}
