package criacionais.abstractfactory.exemplo2.depois;

public class CaixaSelecaoEscura implements CaixaSelecao {

    @Override
    public void renderizar() {
        System.out.println("Renderizando caixa de seleção no estilo escuro (borda cinza escura)");
    }
}
