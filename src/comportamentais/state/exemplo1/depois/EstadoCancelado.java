package comportamentais.state.exemplo1.depois;

public class EstadoCancelado implements EstadoPedido {

    @Override
    public void avancar(Pedido pedido) {
        throw new IllegalStateException("Pedido cancelado não pode avançar.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        throw new IllegalStateException("Pedido já está cancelado.");
    }

    @Override
    public String getNome() {
        return "CANCELADO";
    }
}
