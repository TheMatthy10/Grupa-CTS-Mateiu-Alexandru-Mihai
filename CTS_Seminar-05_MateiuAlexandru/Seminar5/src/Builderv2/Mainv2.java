import Builderv3.IBuilderPacient;
import Builderv3.BuilderPacient;
import Builderv3.Pacient;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(){
    IBuilderPacient builderPacient = new BuilderPacient();
    Pacient pacient = builderPacient.setNume("Matei").setArePatRabatabil(true).setAreHalat(true).setAreMicDejun(true).setArePapuciCamera(true).buildPacient();
    System.out.println(pacient);
    Pacient pacient1 = builderPacient.setNume("Ionut").setAreHalat(true).setArePatRabatabil(true).setAreMicDejun(true).setArePapuciCamera(true).buildPacient();
    System.out.println(pacient1);

}