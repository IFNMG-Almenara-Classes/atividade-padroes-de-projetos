package comportamentais.command.exemplo1.depois;

public class Cliente {

    public static void main(String[] args) {
        Luz luz = new Luz();
        Ventilador ventilador = new Ventilador();
        ControleRemoto controle = new ControleRemoto();

        controle.apertarBotao(new LigarLuzComando(luz));
        controle.apertarBotao(new LigarVentiladorComando(ventilador));

        // O controle nunca conheceu Luz nem Ventilador diretamente — e
        // ganhou desfazer "de graça", porque cada Comando já sabe como se
        // reverter:
        controle.desfazerUltimo();

        // Programar um botão para a TV, que ainda nem existe? Basta criar
        // um TvLigarComando implementando Comando — ControleRemoto não
        // muda uma linha.
    }
}
