package criacionais.builder.exemplo3.depois;

public class Produto {

    private final String nome;
    private final double preco;
    private final String descricao;
    private final String categoria;
    private final double peso;

    // Agora pode ser private de verdade: Builder é uma classe aninhada, e
    // classes aninhadas enxergam os membros private da classe externa.
    private Produto(Builder builder) {
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

    public static class Builder {

        private String nome;
        private double preco;
        private String descricao;
        private String categoria;
        private double peso;

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder preco(double preco) {
            this.preco = preco;
            return this;
        }

        public Builder descricao(String descricao) {
            this.descricao = descricao;
            return this;
        }

        public Builder categoria(String categoria) {
            this.categoria = categoria;
            return this;
        }

        public Builder peso(double peso) {
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
}
