package criacionais.singleton.exemplo1.depois;

public class ServicoPedido {

    public void criarPedido(String descricao) {
        Logger.getInstance().registrar("Pedido criado: " + descricao);
    }
}
