package comportamentais.templatemethod.exemplo1.antes;

public class RelatorioExcel {

    public void gerar() {
        System.out.println("Abrindo conexão com o banco...");
        System.out.println("Buscando dados...");
        System.out.println("Formatando dados como planilha Excel...");
        System.out.println("Fechando conexão.");
    }
}
