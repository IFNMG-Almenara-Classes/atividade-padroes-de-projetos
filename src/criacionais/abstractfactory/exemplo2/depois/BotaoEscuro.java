package criacionais.abstractfactory.exemplo2.depois;

public class BotaoEscuro implements Botao {

    @Override
    public void renderizar() {
        System.out.println("Renderizando botão no estilo escuro (fundo preto, texto branco)");
    }
}
