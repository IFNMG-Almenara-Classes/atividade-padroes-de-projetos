package criacionais.abstractfactory.exemplo2.depois;

public class FabricaTemaEscuro implements FabricaTema {

    @Override
    public Botao criarBotao() {
        return new BotaoEscuro();
    }

    @Override
    public CaixaSelecao criarCaixaSelecao() {
        return new CaixaSelecaoEscura();
    }
}
