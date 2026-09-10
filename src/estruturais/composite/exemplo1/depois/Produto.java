package estruturais.composite.exemplo1.depois;

public class Produto implements ItemCatalogo {

    private final String nome;
    private final double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public int contarItens() {
        return 1;
    }
}
