package criacionais.builder.exemplo3.antes;

public class Produto {

    private final String nome;
    private final double preco;
    private final String descricao;
    private final String categoria;
    private final double peso;

    // O construtor não pode ser "private" de verdade: como ProdutoBuilder é
    // uma classe separada, mesmo estando no mesmo pacote, só enxerga
    // membros "package-private" ou mais abertos — nunca "private".
    Produto(ProdutoBuilder builder) {
        this.nome = builder.nome;
        this.preco = builder.preco;
        this.descricao = builder.descricao;
        this.categoria = builder.categoria;
        this.peso = builder.peso;
    }

    @Override
    public String toString() {
        return nome + " - R$ " + preco
                + (categoria != null ? " [" + categoria + "]" : "")
                + (descricao != null ? " - " + descricao : "")
                + (peso > 0 ? " (" + peso + "kg)" : "");
    }
}
