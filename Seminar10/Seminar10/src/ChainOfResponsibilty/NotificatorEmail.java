package ChainOfResponsibilty;

public class NotificatorEmail extends Notificator{
    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        if(!client.getMail().isEmpty()&&client.getMail() != null){
            System.out.println(client.getNume() + "a primit notificare" + mesaj + "prin email");
        } else if (super.getSuccesor()!=null){
            super.getSuccesor().trimiteNotificare(client, mesaj);
        }
        else{
            System.out.println("Clientul nu are adresa de email si managerul nu este disponibil.");
        }
    }
}
