package SimpleFactory;

public class FactoryPersonal {
    public static PersonalSpital getPersonal(TipPersonalSpital tipPersonalSpital){
        switch (tipPersonalSpital){
            case tipPersonalSpital.Asistent -> {
                return new Asistent();
            }
            case tipPersonalSpital.Medic -> {
                return new Medic();
            }
            case tipPersonalSpital.Brancardier -> {
                return new Brancardier();
            }
            default -> {return null;}
        }
    }
}
