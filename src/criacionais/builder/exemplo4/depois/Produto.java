package criacionais.builder.exemplo4.depois;

public class Produto {

    private final String nome;
    private final double preco;
    private final String descricao;
    private final String categoria;
    private final double peso;

    // Construtor comum, sem nenhuma referência ao Builder: montar o Produto
    // a partir de seus atributos é responsabilidade de quem chama, não do
    // próprio construtor.
    private Produto(String nome, double preco, String descricao, String categoria, double peso) {
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
            // É o Builder quem "traduz" seus próprios campos em uma chamada
            // ao construtor comum de Produto — Produto nem sabe que existe
            // um Builder.
            return new Produto(nome, preco, descricao, categoria, peso);
        }
    }
}
