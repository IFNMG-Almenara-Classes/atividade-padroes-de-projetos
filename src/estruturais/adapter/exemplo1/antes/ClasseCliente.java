package estruturais.adapter.exemplo1.antes;

public class ClasseCliente {

    public static void main(String[] args) {
        CheckoutService checkoutService = new CheckoutService();

        checkoutService.finalizarCompra(new PagamentoPix(), 150.0);

        // GatewayPagamentoExterno não implementa Pagamento — precisa de um
        // método (e uma conversão) só para ele.
        checkoutService.finalizarCompraComGatewayExterno(new GatewayPagamentoExterno(), 90.0);
    }
}
