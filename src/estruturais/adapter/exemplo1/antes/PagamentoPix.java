package estruturais.adapter.exemplo1.antes;

public class PagamentoPix implements Pagamento {

    @Override
    public void processar(double valor) {
        System.out.println("Processando pagamento via Pix: R$ " + valor);
    }
}
