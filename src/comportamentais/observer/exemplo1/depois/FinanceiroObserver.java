package comportamentais.observer.exemplo1.depois;

public class FinanceiroObserver implements ObservadorPedido {

    @Override
    public void atualizar(String novoStatus) {
        if (novoStatus.equals("ENTREGUE")) {
            System.out.println("[Financeiro] Registrando recebimento do pedido.");
        }
    }
}
