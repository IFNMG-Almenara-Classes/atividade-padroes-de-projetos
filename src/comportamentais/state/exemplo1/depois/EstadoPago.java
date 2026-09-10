package comportamentais.state.exemplo1.depois;

public class EstadoPago implements EstadoPedido {

    @Override
    public void avancar(Pedido pedido) {
        pedido.setEstado(new EstadoEnviado());
    }

    @Override
    public void cancelar(Pedido pedido) {
        pedido.setEstado(new EstadoCancelado());
    }

    @Override
    public String getNome() {
        return "PAGO";
    }
}
