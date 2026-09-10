package criacionais.singleton.exemplo1.depois;

public class Logger {

    private static final Logger instancia = new Logger();

    private int totalRegistros = 0;

    private Logger() {
    }

    public static Logger getInstance() {
        return instancia;
    }

    public void registrar(String mensagem) {
        totalRegistros++;
        System.out.println("[LOG #" + totalRegistros + "] " + mensagem);
    }

    public int getTotalRegistros() {
        return totalRegistros;
    }
}
