package criacionais.abstractfactory.exemplo2.depois;

public class FabricaTemaClaro implements FabricaTema {

    @Override
    public Botao criarBotao() {
        return new BotaoClaro();
    }

    @Override
    public CaixaSelecao criarCaixaSelecao() {
        return new CaixaSelecaoClara();
    }
}
