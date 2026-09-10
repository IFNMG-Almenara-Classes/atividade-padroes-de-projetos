package criacionais.factorymethod.exemplo2.depois;

public class Cliente {

    public static void main(String[] args) {
        // Cliente é o único lugar do exemplo que conhece as classes concretas.
        // Em uma aplicação real, essa escolha ficaria na configuração/injeção
        // de dependências — o resto do código nunca dá "new" em nada disso.
        CheckoutService checkoutCartao = new CheckoutService(new ProcessadorCartaoService());
        checkoutCartao.finalizarCompra(150.0);

        CheckoutService checkoutPix = new CheckoutService(new ProcessadorPixService());
        checkoutPix.finalizarCompra(90.0);

        CheckoutService checkoutBoleto = new CheckoutService(new ProcessadorBoletoService());
        checkoutBoleto.finalizarCompra(200.0);
    }
}
