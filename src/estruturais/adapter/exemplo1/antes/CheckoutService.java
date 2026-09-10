package estruturais.adapter.exemplo1.antes;

public class CheckoutService {

    public void finalizarCompra(Pagamento pagamento, double valor) {
        pagamento.processar(valor);
    }

    // Método separado só para o gateway externo, porque sua interface é
    // incompatível com Pagamento — duplica a conversão de reais para
    // centavos toda vez que alguém precisar usar esse gateway.
    public void finalizarCompraComGatewayExterno(GatewayPagamentoExterno gateway, double valor) {
        int valorEmCentavos = (int) Math.round(valor * 100);
        gateway.realizarCobranca(valorEmCentavos);
    }
}
