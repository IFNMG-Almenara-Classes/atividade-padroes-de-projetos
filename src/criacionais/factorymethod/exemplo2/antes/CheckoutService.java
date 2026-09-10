package criacionais.factorymethod.exemplo2.antes;

public class CheckoutService {

    public void finalizarCompra(String tipoPagamento, double valor) {
        if (tipoPagamento.equals("CARTAO")) {
            PagamentoCartao pagamento = new PagamentoCartao();
            pagamento.processarCartao(valor);
        } else if (tipoPagamento.equals("PIX")) {
            PagamentoPix pagamento = new PagamentoPix();
            pagamento.processarPix(valor);
        } else {
            throw new IllegalArgumentException("Tipo de pagamento desconhecido: " + tipoPagamento);
        }
        // Uma forma de pagamento nova (boleto, cripto...) exige mais um "else if" aqui.
    }
}
