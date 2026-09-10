package criacionais.singleton.exemplo2.depois;

public class ConfiguracaoApp {

    private static final ConfiguracaoApp instancia = new ConfiguracaoApp();

    private String nomeAplicacao;
    private String urlBancoDados;
    private String emailRemetente;

    private ConfiguracaoApp() {
        System.out.println("Carregando configurações...");
        this.nomeAplicacao = "Loja XPTO";
        this.urlBancoDados = "jdbc:postgresql://localhost:5432/lojaxpto";
        this.emailRemetente = "no-reply@lojaxpto.com";
    }

    public static ConfiguracaoApp getInstance() {
        return instancia;
    }

    public String getNomeAplicacao() {
        return nomeAplicacao;
    }

    public void setNomeAplicacao(String nomeAplicacao) {
        this.nomeAplicacao = nomeAplicacao;
    }

    public String getUrlBancoDados() {
        return urlBancoDados;
    }

    public String getEmailRemetente() {
        return emailRemetente;
    }
}
