package criacionais.singleton.exemplo2.depois;

public class EmailService {

    public void enviarEmailBoasVindas() {
        ConfiguracaoApp configuracao = ConfiguracaoApp.getInstance();
        System.out.println("Enviando e-mail de boas-vindas de " + configuracao.getEmailRemetente()
                + " (equipe " + configuracao.getNomeAplicacao() + ")");
    }
}
