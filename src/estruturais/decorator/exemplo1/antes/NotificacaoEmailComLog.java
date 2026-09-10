package estruturais.decorator.exemplo1.antes;

// Precisa de log no e-mail? Cria uma subclasse combinando os dois
// comportamentos...
public class NotificacaoEmailComLog implements Notificacao {

    private final NotificacaoEmail email = new NotificacaoEmail();

    @Override
    public void enviar(String mensagem) {
        System.out.println("[LOG] Enviando notificação: " + mensagem);
        email.enviar(mensagem);
        System.out.println("[LOG] Notificação enviada.");
    }
}
