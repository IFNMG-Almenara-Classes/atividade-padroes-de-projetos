package comportamentais.observer.exemplo1.depois;

public class EstoqueObserver implements ObservadorPedido {

    @Override
    public void atualizar(String novoStatus) {
        System.out.println("[Estoque] Atualizando reserva do pedido para status: " + novoStatus);
    }
}
