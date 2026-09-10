package criacionais.abstractfactory.exemplo2.antes;

public class TelaLogin {

    public void renderizar(String tema) {
        if (tema.equals("CLARO")) {
            BotaoClaro botao = new BotaoClaro();
            botao.renderizar();
        } else if (tema.equals("ESCURO")) {
            BotaoEscuro botao = new BotaoEscuro();
            botao.renderizar();
        }

        // Alguém copiou este bloco de outra tela e esqueceu de trocar
        // "CLARO" fixo pelo parâmetro "tema" — bug de copy-paste comum.
        CaixaSelecaoClara caixaSelecao = new CaixaSelecaoClara();
        caixaSelecao.renderizar();
    }
}
