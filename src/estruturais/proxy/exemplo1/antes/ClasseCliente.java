package estruturais.proxy.exemplo1.antes;

public class ClasseCliente {

    public static void main(String[] args) {
        System.out.println("Listando relatórios disponíveis...");
        RelatorioVendas relatorioJaneiro = new RelatorioVendas("Vendas de Janeiro");
        RelatorioVendas relatorioFevereiro = new RelatorioVendas("Vendas de Fevereiro");
        // Os dados PESADOS dos dois relatórios já foram carregados aqui,
        // só para exibir a lista de títulos disponíveis.

        System.out.println("Usuário escolheu abrir: Vendas de Janeiro");
        relatorioJaneiro.exibir();
        // O carregamento de "Vendas de Fevereiro" foi feito à toa — o
        // usuário nunca abriu esse relatório.
    }
}
