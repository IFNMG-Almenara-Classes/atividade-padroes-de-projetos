package criacionais.factorymethod.exemplo2.depois;

public abstract class ProcessadorPagamento {

    protected abstract Pagamento criarPagamento();

    public void processar(double valor) {
        criarPagamento().processar(valor);
    }
}
