package SimpleFactory;

public class FactoryBrancardier extends FactoryMethodPersonal{

    @Override
    public PersonalSpital getPersonal(TipPersonalSpital tipPersonalSpital) {
        return new Brancardier();
    }
}
