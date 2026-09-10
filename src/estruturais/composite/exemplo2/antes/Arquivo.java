package estruturais.composite.exemplo2.antes;

public class Arquivo {

    private final String nome;
    private final long tamanhoKb;

    public Arquivo(String nome, long tamanhoKb) {
        this.nome = nome;
        this.tamanhoKb = tamanhoKb;
    }

    public String getNome() {
        return nome;
    }

    public long getTamanhoKb() {
        return tamanhoKb;
    }
}
