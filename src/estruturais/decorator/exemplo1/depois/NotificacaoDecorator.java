package estruturais.decorator.exemplo1.depois;

public abstract class NotificacaoDecorator implements Notificacao {

    protected final Notificacao notificacaoOriginal;

    protected NotificacaoDecorator(Notificacao notificacaoOriginal) {
        this.notificacaoOriginal = notificacaoOriginal;
    }
}
