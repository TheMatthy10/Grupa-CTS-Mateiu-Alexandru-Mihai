package Command;

public abstract class ComandaTratareImediata extends Command {
    public ComandaTratareImediata(String numePacient, Medic medic){
        super(numePacient, medic);
    }
    @Override
    public void execute(){
        super.getMedic().tratareImediata();
    }
    @Override
    public void undo() {
        super.getMedic().anuleazaTratareImediata();
    }

    @Override
    public void redo() {
        super.getMedic().refaceTratareImediata();
    }
}
