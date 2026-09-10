package estruturais.composite.exemplo2.depois;

public class Arquivo implements ItemSistemaArquivos {

    private final String nome;
    private final long tamanhoKb;

    public Arquivo(String nome, long tamanhoKb) {
        this.nome = nome;
        this.tamanhoKb = tamanhoKb;
    }

    @Override
    public long getTamanhoKb() {
        return tamanhoKb;
    }

    @Override
    public void exibir(String prefixo) {
        System.out.println(prefixo + nome + " (" + tamanhoKb + " KB)");
    }
}
