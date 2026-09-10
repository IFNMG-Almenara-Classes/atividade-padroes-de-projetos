package criacionais.singleton.exemplo1.depois;

public class Cliente {

    public static void main(String[] args) {
        ServicoPedido servicoPedido = new ServicoPedido();
        ServicoPagamento servicoPagamento = new ServicoPagamento();

        servicoPedido.criarPedido("Notebook");
        servicoPedido.criarPedido("Mouse");
        servicoPagamento.processarPagamento(3500.0);

        System.out.println("Total de logs do sistema: " + Logger.getInstance().getTotalRegistros());
    }
}
