package comportamentais.templatemethod.exemplo1.depois;

public class Cliente {

    public static void main(String[] args) {
        new RelatorioPdf().gerar();
        new RelatorioExcel().gerar();

        // Um formato novo (CSV) é só uma classe nova sobrescrevendo
        // formatar() — o resto do algoritmo (abrir conexão, buscar dados,
        // fechar conexão) já existe em GeradorRelatorio e não é duplicado
        // em lugar nenhum. Dá até para criar um formato "avulso" sem
        // classe própria, com classe anônima:
        GeradorRelatorio relatorioCsv = new GeradorRelatorio() {
            @Override
            protected void formatar() {
                System.out.println("Formatando dados como CSV...");
            }
        };
        relatorioCsv.gerar();
    }
}
