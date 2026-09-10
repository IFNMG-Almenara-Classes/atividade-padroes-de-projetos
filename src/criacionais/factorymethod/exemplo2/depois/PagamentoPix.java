package criacionais.factorymethod.exemplo2.depois;

public class PagamentoPix implements Pagamento {

    @Override
    public void processar(double valor) {
        System.out.println("Processando pagamento via Pix: R$ " + valor);
    }
}
