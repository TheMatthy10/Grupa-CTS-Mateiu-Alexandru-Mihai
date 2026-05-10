package Command;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainCommand {
     static void main() {
            Medic medic1 = new Medic("Mihai");
            Command comanda1 = new ComandaInternare("Maria", medic1);
            Command comanda2 = new ComandaInternare("Ana", medic1);
            Command comanda3 = new ComandaInternare("Popa", medic1);
            OperatorTriaj operatorTriaj = new OperatorTriaj();
            operatorTriaj.adaugaComanda(comanda1);
            operatorTriaj.adaugaComanda(comanda2);
            operatorTriaj.adaugaComanda(comanda3);
            operatorTriaj.trimiteComanda();
            operatorTriaj.trimiteComanda();
            operatorTriaj.trimiteComanda();
            operatorTriaj.trimiteComanda();

            operatorTriaj.anuleazaComanda();
            operatorTriaj.anuleazaComanda();
            operatorTriaj.anuleazaComanda();
            operatorTriaj.anuleazaComanda();

            operatorTriaj.refacereComanda();
            operatorTriaj.refacereComanda();
            operatorTriaj.refacereComanda();
        }
    }
