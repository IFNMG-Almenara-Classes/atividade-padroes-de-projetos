package comportamentais.command.exemplo1.antes;

public class ControleRemoto {

    private final Luz luz = new Luz();
    private final Ventilador ventilador = new Ventilador();

    public void apertarBotao(String comando) {
        // O controle precisa conhecer todos os aparelhos e decidir, na
        // marra, o que cada botão faz.
        if (comando.equals("LUZ_LIGAR")) {
            luz.ligar();
        } else if (comando.equals("LUZ_DESLIGAR")) {
            luz.desligar();
        } else if (comando.equals("VENTILADOR_LIGAR")) {
            ventilador.ligar();
        } else if (comando.equals("VENTILADOR_DESLIGAR")) {
            ventilador.desligar();
        } else {
            throw new IllegalArgumentException("Comando desconhecido: " + comando);
        }
    }
}
