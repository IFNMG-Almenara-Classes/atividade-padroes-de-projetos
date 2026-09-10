package criacionais.builder.exemplo4.antes;

public class Produto {

    private final String nome;
    private final double preco;
    private final String descricao;
    private final String categoria;
    private final double peso;

    public Produto(String nome, double preco, String descricao, String categoria, double peso) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.categoria = categoria;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return nome + " - R$ " + preco
                + (categoria != null ? " [" + categoria + "]" : "")
                + (descricao != null ? " - " + descricao : "")
                + (peso > 0 ? " (" + peso + "kg)" : "");
    }
}
