package comportamentais.command.exemplo1.depois;

public class LigarVentiladorComando implements Comando {

    private final Ventilador ventilador;

    public LigarVentiladorComando(Ventilador ventilador) {
        this.ventilador = ventilador;
    }

    @Override
    public void executar() {
        ventilador.ligar();
    }

    @Override
    public void desfazer() {
        ventilador.desligar();
    }
}
