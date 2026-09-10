package criacionais.abstractfactory.exemplo1.antes;

public class PagamentoCartao {

    public void processar(double valor) {
        System.out.println("Processando pagamento no cartão: R$ " + valor);
    }
}
