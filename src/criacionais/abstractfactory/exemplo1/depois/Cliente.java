package criacionais.abstractfactory.exemplo1.depois;

public class Cliente {

    public static void main(String[] args) {
        // Cliente é o único lugar do exemplo que conhece as fábricas
        // concretas e decide qual "kit" de checkout usar por país.
        CheckoutService checkoutBrasil = new CheckoutService(new FabricaCheckoutBrasil());
        checkoutBrasil.finalizarCompra("Seu pedido foi confirmado!", 150.0);

        CheckoutService checkoutEua = new CheckoutService(new FabricaCheckoutEUA());
        checkoutEua.finalizarCompra("Your order has been confirmed!", 90.0);




        // Para adicionar Portugal, basta criar FabricaCheckoutPortugal
        // implementando FabricaCheckout — a interface obriga a fornecer os
        // dois produtos, então é impossível esquecer um deles.
    }
}
