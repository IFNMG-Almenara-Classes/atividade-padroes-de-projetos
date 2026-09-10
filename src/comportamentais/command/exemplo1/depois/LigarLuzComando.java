package comportamentais.command.exemplo1.depois;

public class LigarLuzComando implements Comando {

    private final Luz luz;

    public LigarLuzComando(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void executar() {
        luz.ligar();
    }

    @Override
    public void desfazer() {
        luz.desligar();
    }
}
