package ChainOfResponsibilty;

public class NotificatorSMS extends Notificator{
    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        if(!client.getTelefon().isEmpty() && client.getTelefon() != null){
            System.out.println(client.getNume() + "a primit notificare" + mesaj + "prin SMS");
        } else if (super.getSuccesor()!=null){
            super.getSuccesor().trimiteNotificare(client, mesaj);
        }
        else{
            System.out.println("Clientul nu are numar de telefon si managerul nu este disponibil.");
        }
    }
}
