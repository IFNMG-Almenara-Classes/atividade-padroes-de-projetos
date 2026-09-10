package estruturais.adapter.exemplo1.depois;

// Simula uma biblioteca de terceiros, pronta, que não podemos alterar.
public class GatewayPagamentoExterno {

    public void realizarCobranca(int valorEmCentavos) {
        System.out.println("Cobrando R$ " + (valorEmCentavos / 100.0) + " via gateway externo");
    }
}
