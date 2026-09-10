package estruturais.facade.exemplo2.antes;

public class ClasseCliente {

    public static void main(String[] args) {
        Projetor projetor = new Projetor();
        SistemaSom som = new SistemaSom();
        Luzes luzes = new Luzes();
        Streaming streaming = new Streaming();

        // Assistir um filme exige conhecer e orquestrar 4 subsistemas, na
        // ordem certa:
        luzes.ajustar(10);
        projetor.ligar();
        projetor.configurarModoCinema();
        som.ligar();
        som.definirVolume(15);
        streaming.ligar();
        streaming.reproduzir("Matrix");

        System.out.println("--- Fim do filme ---");

        streaming.desligar();
        som.desligar();
        projetor.desligar();
        luzes.ajustar(100);

        // Toda vez que alguém quiser assistir um filme em outro lugar do
        // sistema (ou de casa), essas duas sequências precisam ser
        // repetidas na ordem certa.
    }
}
