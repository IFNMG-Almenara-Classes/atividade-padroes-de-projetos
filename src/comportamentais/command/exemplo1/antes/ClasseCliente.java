package comportamentais.command.exemplo1.antes;

public class ClasseCliente {

    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();
        controle.apertarBotao("LUZ_LIGAR");
        controle.apertarBotao("VENTILADOR_LIGAR");

        // E se quisermos desfazer a última ação (desligar de novo)? Ou
        // programar um botão para ligar a TV, que ainda nem existe no
        // controle? É preciso editar ControleRemoto de novo, e ele já
        // conhece todos os aparelhos da casa diretamente.
    }
}
