package criacionais.factorymethod.exemplo2.depois;

public class PagamentoBoleto implements Pagamento {

    @Override
    public void processar(double valor) {
        System.out.println("Processando pagamento via boleto: R$ " + valor);
    }
}
