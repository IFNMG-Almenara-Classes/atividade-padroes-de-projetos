package criacionais.singleton.exemplo2.antes;

public class RelatorioService {

    private final ConfiguracaoApp configuracao = new ConfiguracaoApp();

    public void gerarRelatorio() {
        System.out.println("Relatório de vendas — " + configuracao.getNomeAplicacao());
    }

    public ConfiguracaoApp getConfiguracao() {
        return configuracao;
    }
}
