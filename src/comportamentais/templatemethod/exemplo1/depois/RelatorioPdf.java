package comportamentais.templatemethod.exemplo1.depois;

public class RelatorioPdf extends GeradorRelatorio {

    @Override
    protected void formatar() {
        System.out.println("Formatando dados como PDF...");
    }
}
