package criacionais.factorymethod.exemplo2.depois;

public class ProcessadorCartaoService extends ProcessadorPagamento {

    @Override
    protected Pagamento criarPagamento() {
        return new PagamentoCartao();
    }
}
