package comportamentais.observer.exemplo1.antes;

public class EstoqueService {

    public void atualizar(String novoStatus) {
        System.out.println("[Estoque] Atualizando reserva do pedido para status: " + novoStatus);
    }
}
