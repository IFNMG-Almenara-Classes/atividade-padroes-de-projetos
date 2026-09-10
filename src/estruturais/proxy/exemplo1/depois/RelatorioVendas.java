package estruturais.proxy.exemplo1.depois;

public class RelatorioVendas implements Relatorio {

    private final String titulo;

    public RelatorioVendas(String titulo) {
        this.titulo = titulo;
        carregarDadosPesados();
    }

    private void carregarDadosPesados() {
        System.out.println("Carregando dados do relatório \"" + titulo + "\"... (operação pesada)");
    }

    @Override
    public void exibir() {
        System.out.println("Exibindo relatório: " + titulo);
    }
}
