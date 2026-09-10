package comportamentais.state.exemplo1.depois;

public interface EstadoPedido {

    void avancar(Pedido pedido);

    void cancelar(Pedido pedido);

    String getNome();
}
