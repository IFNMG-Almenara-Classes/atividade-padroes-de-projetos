package estruturais.facade.exemplo2.depois;

public class CinemaEmCasaFacade {

    private final Projetor projetor = new Projetor();
    private final SistemaSom som = new SistemaSom();
    private final Luzes luzes = new Luzes();
    private final Streaming streaming = new Streaming();

    public void assistirFilme(String filme) {
        luzes.ajustar(10);
        projetor.ligar();
        projetor.configurarModoCinema();
        som.ligar();
        som.definirVolume(15);
        streaming.ligar();
        streaming.reproduzir(filme);
    }

    public void encerrarSessao() {
        streaming.desligar();
        som.desligar();
        projetor.desligar();
        luzes.ajustar(100);
    }
}
