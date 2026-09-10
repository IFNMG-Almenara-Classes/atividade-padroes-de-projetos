package estruturais.adapter.exemplo1.depois;

public class Cliente {

    public static void main(String[] args) {
        CheckoutService checkoutService = new CheckoutService();

        checkoutService.finalizarCompra(new PagamentoPix(), 150.0);

        // O adapter faz o gateway externo parecer um Pagamento normal — o
        // CheckoutService não precisa de método nenhum especial para ele.
        checkoutService.finalizarCompra(new GatewayPagamentoAdapter(new GatewayPagamentoExterno()), 90.0);
    }
}
