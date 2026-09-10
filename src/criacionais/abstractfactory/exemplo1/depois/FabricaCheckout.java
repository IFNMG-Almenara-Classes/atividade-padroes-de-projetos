package criacionais.abstractfactory.exemplo1.depois;

public interface FabricaCheckout {

    Notificacao criarNotificacao();

    Pagamento criarPagamento();
}
