package estruturais.facade.exemplo1.depois;

public class Cliente {

    public static void main(String[] args) {
        CheckoutFacade checkout = new CheckoutFacade();
        checkout.finalizarCompra("Notebook", 1, 3500.0, "01310-100");
    }
}
