package Builderv2;

public interface IBuilderPacient{
    Pacient buildPacient();
    IBuilderPacient setArePatRabatabil(boolean arePatRabatabil);
    IBuilderPacient setAreMicDejun(boolean areMicDejun);
    IBuilderPacient setArePapuciCamera(boolean arePapuciCamera);
    IBuilderPacient setAreHalat(boolean areHalat);
    IBuilderPacient setNume(String nume);
}
