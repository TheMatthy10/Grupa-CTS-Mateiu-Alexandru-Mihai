package SimpleFactory;

public class FactoryAsistent extends FactoryMethodPersonal {

    @Override
    public PersonalSpital getPersonal(TipPersonalSpital tipPersonalSpital) {
        return new Asistent();
    }
}