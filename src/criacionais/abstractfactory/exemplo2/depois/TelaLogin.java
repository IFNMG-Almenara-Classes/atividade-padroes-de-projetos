package criacionais.abstractfactory.exemplo2.depois;

public class TelaLogin {

    private final FabricaTema fabrica;

    public TelaLogin(FabricaTema fabrica) {
        this.fabrica = fabrica;
    }

    public void renderizar() {
        Botao botao = fabrica.criarBotao();
        CaixaSelecao caixaSelecao = fabrica.criarCaixaSelecao();

        botao.renderizar();
        caixaSelecao.renderizar();
    }
}
