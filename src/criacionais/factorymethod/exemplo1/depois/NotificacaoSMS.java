package criacionais.factorymethod.exemplo1.depois;

public class NotificacaoSMS implements Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}
