package estruturais.proxy.exemplo1.depois;

public class RelatorioVendasProxy implements Relatorio {

    private final String titulo;
    private RelatorioVendas relatorioReal;

    public RelatorioVendasProxy(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void exibir() {
        if (relatorioReal == null) {
            relatorioReal = new RelatorioVendas(titulo); // só carrega quando é preciso
        }
        relatorioReal.exibir();
    }
}
