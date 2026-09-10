package criacionais.abstractfactory.exemplo1.depois;

public class NotificacaoSms implements Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}
