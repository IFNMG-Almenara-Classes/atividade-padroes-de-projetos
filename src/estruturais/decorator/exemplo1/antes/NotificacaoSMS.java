package estruturais.decorator.exemplo1.antes;

public class NotificacaoSMS implements Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}
