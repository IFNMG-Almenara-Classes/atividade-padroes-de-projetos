package criacionais.factorymethod.exemplo1.depois;

public abstract class NotificadorService {

    protected abstract Notificacao criarNotificacao();

    public void notificar(String mensagem) {
        criarNotificacao().enviar(mensagem);
    }
}
