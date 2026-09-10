package criacionais.singleton.exemplo1.antes;

public class ClasseCliente {

    public static void main(String[] args) {
        ServicoPedido servicoPedido = new ServicoPedido();
        ServicoPagamento servicoPagamento = new ServicoPagamento();

        servicoPedido.criarPedido("Notebook");
        servicoPedido.criarPedido("Mouse");
        servicoPagamento.processarPagamento(3500.0);

        // O sistema teve 3 eventos, mas nenhum contador mostra "3" — cada
        // Logger só enxerga o que ele mesmo registrou.
        System.out.println("Total de logs no ServicoPedido: " + servicoPedido.getLogger().getTotalRegistros());
        System.out.println("Total de logs no ServicoPagamento: " + servicoPagamento.getLogger().getTotalRegistros());
    }
}
