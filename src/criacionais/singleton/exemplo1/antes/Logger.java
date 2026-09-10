package criacionais.singleton.exemplo1.antes;

public class Logger {

    private int totalRegistros = 0;

    public void registrar(String mensagem) {
        totalRegistros++;
        System.out.println("[LOG #" + totalRegistros + "] " + mensagem);
    }

    public int getTotalRegistros() {
        return totalRegistros;
    }
}
