package comportamentais.state.exemplo1.depois;

public class Pedido {

    private EstadoPedido estado = new EstadoNovo();

    public void avancar() {
        estado.avancar(this);
    }

    public void cancelar() {
        estado.cancelar(this);
    }

    void setEstado(EstadoPedido novoEstado) {
        this.estado = novoEstado;
        System.out.println("Pedido agora está: " + novoEstado.getNome());
    }

    public String getStatus() {
        return estado.getNome();
    }
}
