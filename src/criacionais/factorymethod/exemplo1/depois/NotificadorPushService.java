package criacionais.factorymethod.exemplo1.depois;

public class NotificadorPushService extends NotificadorService {

    @Override
    protected Notificacao criarNotificacao() {
        return new NotificacaoPush();
    }
}
