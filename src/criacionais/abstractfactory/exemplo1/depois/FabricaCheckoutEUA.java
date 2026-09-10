package criacionais.abstractfactory.exemplo1.depois;

public class FabricaCheckoutEUA implements FabricaCheckout {

    @Override
    public Notificacao criarNotificacao() {
        return new NotificacaoEmail();
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoCartao();
    }
}
