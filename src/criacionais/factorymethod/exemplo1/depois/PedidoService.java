package criacionais.factorymethod.exemplo1.depois;

public class PedidoService {

    private final NotificadorService notificador;

    public PedidoService(NotificadorService notificador) {
        this.notificador = notificador;
    }

    public void confirmarPedido() {
        notificador.notificar("Seu pedido foi confirmado!");
    }
}
