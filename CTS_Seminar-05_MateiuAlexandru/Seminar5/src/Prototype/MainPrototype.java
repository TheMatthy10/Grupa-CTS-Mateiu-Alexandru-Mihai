import Prototype.RetetaMedicament;

import java.util.Map;

void main(){
    RetetaMedicament retetaMedicament = new RetetaMedicament("Medicament1", Map.of("solutia1", 3.0));
    RetetaMedicament copieRetetaMedicament = (RetetaMedicament) retetaMedicament.cloneaza();
    System.out.println(retetaMedicament==copieRetetaMedicament);
    System.out.println(retetaMedicament);
    System.out.println(copieRetetaMedicament);

    retetaMedicament.getSolutii().put("solutie1",23.45);
}

