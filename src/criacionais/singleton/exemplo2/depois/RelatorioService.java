package criacionais.singleton.exemplo2.depois;

public class RelatorioService {

    public void gerarRelatorio() {
        String nomeAplicacao = ConfiguracaoApp.getInstance().getNomeAplicacao();
        System.out.println("Relatório de vendas — " + nomeAplicacao);
    }
}
