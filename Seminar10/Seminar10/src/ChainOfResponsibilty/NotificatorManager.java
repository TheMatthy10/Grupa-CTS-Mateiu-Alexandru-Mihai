package ChainOfResponsibilty;

public class NotificatorManager extends Notificator{
    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        System.out.println(client.getNume() + "nu are telefon sau email, o notificare a fost trimisa managerului");
    }
}
