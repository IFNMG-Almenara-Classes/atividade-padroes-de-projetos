package comportamentais.state.exemplo1.depois;

public class EstadoNovo implements EstadoPedido {

    @Override
    public void avancar(Pedido pedido) {
        pedido.setEstado(new EstadoPago());
    }

    @Override
    public void cancelar(Pedido pedido) {
        pedido.setEstado(new EstadoCancelado());
    }

    @Override
    public String getNome() {
        return "NOVO";
    }
}
