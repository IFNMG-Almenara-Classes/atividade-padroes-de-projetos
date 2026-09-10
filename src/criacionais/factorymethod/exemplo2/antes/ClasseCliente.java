package criacionais.factorymethod.exemplo2.antes;

public class ClasseCliente {

    public static void main(String[] args) {
        CheckoutService checkoutService = new CheckoutService();

        checkoutService.finalizarCompra("CARTAO", 150.0);
        checkoutService.finalizarCompra("PIX", 90.0);
    }
}
