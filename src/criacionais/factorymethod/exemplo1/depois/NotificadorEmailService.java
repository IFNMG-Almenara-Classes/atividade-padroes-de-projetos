package criacionais.factorymethod.exemplo1.depois;

public class NotificadorEmailService extends NotificadorService {

    @Override
    protected Notificacao criarNotificacao() {
        return new NotificacaoEmail();
    }
}
