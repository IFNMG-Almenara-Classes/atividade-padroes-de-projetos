package estruturais.proxy.exemplo1.antes;

public class RelatorioVendas {

    private final String titulo;

    public RelatorioVendas(String titulo) {
        this.titulo = titulo;
        carregarDadosPesados();
    }

    private void carregarDadosPesados() {
        System.out.println("Carregando dados do relatório \"" + titulo + "\"... (operação pesada)");
    }

    public void exibir() {
        System.out.println("Exibindo relatório: " + titulo);
    }
}
