package criacionais.abstractfactory.exemplo1.antes;

public class ClasseCliente {

    public static void main(String[] args) {
        CheckoutService checkoutService = new CheckoutService();

        checkoutService.finalizarCompra("BRASIL", 150.0);
        checkoutService.finalizarCompra("EUA", 90.0);

        // Alguém copia o bloco de notificação para o país novo, mas esquece
        // de atualizar o bloco de pagamento correspondente...
        checkoutService.finalizarCompra("PORTUGAL", 60.0);
        // ...e o pedido de Portugal não recebe NEM notificação, NEM
        // pagamento processado — os dois "if" ficaram fora de sincronia, e
        // ninguém percebeu (nenhuma exceção é lançada).
    }
}
