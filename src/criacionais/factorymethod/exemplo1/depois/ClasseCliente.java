package criacionais.factorymethod.exemplo1.depois;

public class ClasseCliente {

    public static void main(String[] args) {
        // Cliente é o único lugar do exemplo que conhece as classes concretas.
        // Em uma aplicação real, essa escolha ficaria na configuração/injeção
        // de dependências — o resto do código nunca dá "new" em nada disso.
        PedidoService pedidoEmail = new PedidoService(new NotificadorEmailService());
        pedidoEmail.confirmarPedido();

        PedidoService pedidoSms = new PedidoService(new NotificadorSmsService());
        pedidoSms.confirmarPedido();

        PedidoService pedidoPush = new PedidoService(new NotificadorPushService());
        pedidoPush.confirmarPedido();
    }
}
