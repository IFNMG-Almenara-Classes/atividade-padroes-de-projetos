package criacionais.factorymethod.exemplo2.depois;

public class PagamentoCartao implements Pagamento {

    @Override
    public void processar(double valor) {
        System.out.println("Processando pagamento no cartão: R$ " + valor);
    }
}
