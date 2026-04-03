import Builderv1.BuilderPacient;
import Builderv1.IBuilderPacient;
import Builderv1.Pacient;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(){
    IBuilderPacient builderPacient = new BuilderPacient();
    Pacient pacient = builderPacient.setNume("Matei").setArePatRabatabil(true).setAreHalat(true).setAreMicDejun(true).setArePapuciCamera(true).buildPacient();
    System.out.println(pacient);
    Pacient pacient1 = builderPacient.setNume("Ionut").setAreHalat(true).setArePatRabatabil(true).setAreMicDejun(true).setArePapuciCamera(true).buildPacient();
    System.out.println(pacient1);

}