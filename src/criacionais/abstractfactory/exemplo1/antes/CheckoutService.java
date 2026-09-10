package criacionais.abstractfactory.exemplo1.antes;

public class CheckoutService {

    public void finalizarCompra(String pais, double valor) {
        // Cada característica do checkout é escolhida em um "if" separado...
        if (pais.equals("BRASIL")) {
            NotificacaoSms notificacao = new NotificacaoSms();
            notificacao.enviar("Seu pedido foi confirmado!");
        } else if (pais.equals("EUA")) {
            NotificacaoEmail notificacao = new NotificacaoEmail();
            notificacao.enviar("Your order has been confirmed!");
        }

        // ...e nada impede que as duas escolhas fiquem fora de sincronia.
        if (pais.equals("BRASIL")) {
            PagamentoPix pagamento = new PagamentoPix();
            pagamento.processar(valor);
        } else if (pais.equals("EUA")) {
            PagamentoCartao pagamento = new PagamentoCartao();
            pagamento.processar(valor);
        }
    }
}
