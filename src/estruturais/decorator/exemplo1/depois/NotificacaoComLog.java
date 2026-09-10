package estruturais.decorator.exemplo1.depois;

public class NotificacaoComLog extends NotificacaoDecorator {

    public NotificacaoComLog(Notificacao notificacaoOriginal) {
        super(notificacaoOriginal);
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("[LOG] Enviando notificação: " + mensagem);
        notificacaoOriginal.enviar(mensagem);
        System.out.println("[LOG] Notificação enviada.");
    }
}
