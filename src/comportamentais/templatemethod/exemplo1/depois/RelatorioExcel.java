package comportamentais.templatemethod.exemplo1.depois;

public class RelatorioExcel extends GeradorRelatorio {

    @Override
    protected void formatar() {
        System.out.println("Formatando dados como planilha Excel...");
    }
}
