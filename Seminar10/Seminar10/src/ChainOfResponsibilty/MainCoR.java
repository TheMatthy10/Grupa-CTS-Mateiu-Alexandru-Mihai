package ChainOfResponsibilty;

import java.util.Arrays;
import java.util.List;

public class MainCoR {
     static void main(){

        Client client1 = new Client("Client1", null, "mail@ase.ro");
         Client client2 = new Client("Client2", "123", null);
         Client client3 = new Client("Client3", null, null);
        Notificator notificatorSMS = new NotificatorSMS();
        Notificator notificatorEmail = new NotificatorEmail();
        Notificator notificatorManager = new NotificatorManager();

        notificatorSMS.setSuccesor(notificatorEmail);
        notificatorEmail.setSuccesor(notificatorManager);

        List<Client> clienti = Arrays.asList(client1, client2, client3);

        clienti.forEach(client -> notificatorSMS.trimiteNotificare(client, "Ai"));
}
    }
