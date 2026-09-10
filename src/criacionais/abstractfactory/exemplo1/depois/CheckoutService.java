package criacionais.abstractfactory.exemplo1.depois;

public class CheckoutService {

    private final FabricaCheckout fabrica;

    public CheckoutService(FabricaCheckout fabrica) {
        this.fabrica = fabrica;
    }

    public void finalizarCompra(String mensagem, double valor) {
        Notificacao notificacao = fabrica.criarNotificacao();
        Pagamento pagamento = fabrica.criarPagamento();

        notificacao.enviar(mensagem);
        pagamento.processar(valor);
    }
}
