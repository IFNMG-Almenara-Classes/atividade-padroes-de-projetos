package criacionais.factorymethod.exemplo1.antes;

public class ClasseCliente {

    public static void main(String[] args) {
        PedidoService pedidoService = new PedidoService();

        pedidoService.confirmarPedido("EMAIL");
        pedidoService.confirmarPedido("SMS");
    }
}
