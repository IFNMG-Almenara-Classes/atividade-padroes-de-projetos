package criacionais.singleton.exemplo2.antes;

public class EmailService {

    private final ConfiguracaoApp configuracao = new ConfiguracaoApp();

    public void enviarEmailBoasVindas() {
        System.out.println("Enviando e-mail de boas-vindas de " + configuracao.getEmailRemetente()
                + " (equipe " + configuracao.getNomeAplicacao() + ")");
    }

    public ConfiguracaoApp getConfiguracao() {
        return configuracao;
    }
}
