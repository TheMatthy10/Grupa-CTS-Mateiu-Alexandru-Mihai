package Command;

public class ComandaInternare extends Command {
    public ComandaInternare(String numePacient, Medic medic){
        super(numePacient, medic);
    }
    @Override
    public void execute(){
        super.getMedic().internarePacient();
    }

    @Override
    public void undo() {
        super.getMedic().anuleazaInternarePacient();
    }

    @Override
    public void redo() {
        super.getMedic().refaceInternarePacient();
    }
}
