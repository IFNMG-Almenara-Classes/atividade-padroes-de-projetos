package estruturais.decorator.exemplo1.antes;

// ...e se quiser log no SMS também, duplica tudo de novo:
public class NotificacaoSMSComLog implements Notificacao {

    private final NotificacaoSMS sms = new NotificacaoSMS();

    @Override
    public void enviar(String mensagem) {
        System.out.println("[LOG] Enviando notificação: " + mensagem);
        sms.enviar(mensagem);
        System.out.println("[LOG] Notificação enviada.");
    }
}
