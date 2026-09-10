package criacionais.factorymethod.exemplo2.depois;

public class CheckoutService {

    private final ProcessadorPagamento processador;

    public CheckoutService(ProcessadorPagamento processador) {
        this.processador = processador;
    }

    public void finalizarCompra(double valor) {
        processador.processar(valor);
    }
}
