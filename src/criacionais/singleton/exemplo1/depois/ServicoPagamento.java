package criacionais.singleton.exemplo1.depois;

public class ServicoPagamento {

    public void processarPagamento(double valor) {
        Logger.getInstance().registrar("Pagamento processado: R$ " + valor);
    }
}
