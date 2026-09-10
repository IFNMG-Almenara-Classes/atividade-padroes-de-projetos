package criacionais.abstractfactory.exemplo2.depois;

public class BotaoClaro implements Botao {

    @Override
    public void renderizar() {
        System.out.println("Renderizando botão no estilo claro (fundo branco, texto preto)");
    }
}
