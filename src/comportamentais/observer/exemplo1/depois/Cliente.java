package comportamentais.observer.exemplo1.depois;

public class Cliente {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.adicionarObservador(new EmailObserver());
        pedido.adicionarObservador(new EstoqueObserver());
        pedido.adicionarObservador(new FinanceiroObserver());

        pedido.avancarStatus("PAGO");
        pedido.avancarStatus("ENTREGUE");

        // Marketing quer saber quando o pedido é entregue? Basta criar um
        // observador novo e registrá-lo — Pedido não muda uma linha. Como
        // ObservadorPedido tem um único método, dá até para usar lambda:
        pedido.adicionarObservador(novoStatus -> {
            if (novoStatus.equals("ENTREGUE")) {
                System.out.println("[Marketing] Pedindo avaliação do pedido.");
            }
        });
        pedido.avancarStatus("ENTREGUE");
    }
}
