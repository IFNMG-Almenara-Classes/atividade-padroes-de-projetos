package criacionais.abstractfactory.exemplo2.depois;

public class CaixaSelecaoClara implements CaixaSelecao {

    @Override
    public void renderizar() {
        System.out.println("Renderizando caixa de seleção no estilo claro (borda cinza clara)");
    }
}
