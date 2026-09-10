package comportamentais.observer.exemplo1.depois;

public class EmailObserver implements ObservadorPedido {

    @Override
    public void atualizar(String novoStatus) {
        System.out.println("[E-mail] Pedido mudou para: " + novoStatus);
    }
}
