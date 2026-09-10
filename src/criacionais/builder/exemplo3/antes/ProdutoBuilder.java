package criacionais.builder.exemplo3.antes;

public class ProdutoBuilder {

    String nome;
    double preco;
    String descricao;
    String categoria;
    double peso;

    public ProdutoBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public ProdutoBuilder preco(double preco) {
        this.preco = preco;
        return this;
    }

    public ProdutoBuilder descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public ProdutoBuilder categoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public ProdutoBuilder peso(double peso) {
        this.peso = peso;
        return this;
    }

    public Produto build() {
        if (nome == null || preco <= 0) {
            throw new IllegalStateException("nome e preco são obrigatórios");
        }
        return new Produto(this);
    }
}
