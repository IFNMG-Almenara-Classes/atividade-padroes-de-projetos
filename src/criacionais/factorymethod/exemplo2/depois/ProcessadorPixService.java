package criacionais.factorymethod.exemplo2.depois;

public class ProcessadorPixService extends ProcessadorPagamento {

    @Override
    protected Pagamento criarPagamento() {
        return new PagamentoPix();
    }
}
