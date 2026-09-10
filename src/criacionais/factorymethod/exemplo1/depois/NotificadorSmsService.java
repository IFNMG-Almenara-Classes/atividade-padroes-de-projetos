package criacionais.factorymethod.exemplo1.depois;

public class NotificadorSmsService extends NotificadorService {

    @Override
    protected Notificacao criarNotificacao() {
        return new NotificacaoSMS();
    }
}
