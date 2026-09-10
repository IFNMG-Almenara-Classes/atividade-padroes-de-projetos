package estruturais.adapter.exemplo1.depois;

public class CheckoutService {

    public void finalizarCompra(Pagamento pagamento, double valor) {
        pagamento.processar(valor);
    }
}
