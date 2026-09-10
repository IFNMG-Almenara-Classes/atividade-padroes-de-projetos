package estruturais.adapter.exemplo1.depois;

public class GatewayPagamentoAdapter implements Pagamento {

    private final GatewayPagamentoExterno gateway;

    public GatewayPagamentoAdapter(GatewayPagamentoExterno gateway) {
        this.gateway = gateway;
    }

    @Override
    public void processar(double valor) {
        int valorEmCentavos = (int) Math.round(valor * 100);
        gateway.realizarCobranca(valorEmCentavos);
    }
}
