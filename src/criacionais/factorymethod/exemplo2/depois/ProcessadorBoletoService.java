package criacionais.factorymethod.exemplo2.depois;

public class ProcessadorBoletoService extends ProcessadorPagamento {

    @Override
    protected Pagamento criarPagamento() {
        return new PagamentoBoleto();
    }
}
