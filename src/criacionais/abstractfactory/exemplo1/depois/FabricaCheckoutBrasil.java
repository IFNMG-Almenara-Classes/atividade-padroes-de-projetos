package criacionais.abstractfactory.exemplo1.depois;

public class FabricaCheckoutBrasil implements FabricaCheckout {

    @Override
    public Notificacao criarNotificacao() {
        return new NotificacaoSms();
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoPix();
    }
}
