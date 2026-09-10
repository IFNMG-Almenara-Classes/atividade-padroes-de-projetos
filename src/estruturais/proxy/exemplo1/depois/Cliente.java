package estruturais.proxy.exemplo1.depois;

public class Cliente {

    public static void main(String[] args) {
        System.out.println("Listando relatórios disponíveis...");
        Relatorio relatorioJaneiro = new RelatorioVendasProxy("Vendas de Janeiro");
        Relatorio relatorioFevereiro = new RelatorioVendasProxy("Vendas de Fevereiro");
        // Nenhum dado pesado foi carregado ainda — só criamos os proxies.

        System.out.println("Usuário escolheu abrir: Vendas de Janeiro");
        relatorioJaneiro.exibir();
        // Só agora o carregamento pesado de Janeiro acontece. "Vendas de
        // Fevereiro" nunca chega a ser carregado, porque o usuário não
        // abriu esse relatório.
    }
}
