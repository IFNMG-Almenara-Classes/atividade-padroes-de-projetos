package estruturais.decorator.exemplo1.depois;

public class NotificacaoUrgente extends NotificacaoDecorator {

    public NotificacaoUrgente(Notificacao notificacaoOriginal) {
        super(notificacaoOriginal);
    }

    @Override
    public void enviar(String mensagem) {
        notificacaoOriginal.enviar("[URGENTE] " + mensagem);
    }
}
