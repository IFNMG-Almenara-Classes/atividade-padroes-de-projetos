package comportamentais.state.exemplo1.depois;

public class EstadoEnviado implements EstadoPedido {

    @Override
    public void avancar(Pedido pedido) {
        pedido.setEstado(new EstadoEntregue());
    }

    @Override
    public void cancelar(Pedido pedido) {
        pedido.setEstado(new EstadoCancelado());
    }

    @Override
    public String getNome() {
        return "ENVIADO";
    }
}
