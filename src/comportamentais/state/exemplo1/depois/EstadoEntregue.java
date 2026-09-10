package comportamentais.state.exemplo1.depois;

public class EstadoEntregue implements EstadoPedido {

    @Override
    public void avancar(Pedido pedido) {
        throw new IllegalStateException("Pedido entregue não pode avançar mais.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        throw new IllegalStateException("Pedido entregue não pode ser cancelado.");
    }

    @Override
    public String getNome() {
        return "ENTREGUE";
    }
}
