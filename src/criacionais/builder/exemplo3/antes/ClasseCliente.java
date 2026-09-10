package criacionais.builder.exemplo3.antes;

public class ClasseCliente {

    public static void main(String[] args) {
        Produto produto = new ProdutoBuilder()
                .nome("Teclado Mecânico")
                .preco(350.0)
                .categoria("Periféricos")
                .peso(1.1)
                .build();

        System.out.println(produto);

        // Nada impede outra classe do mesmo pacote de chamar o construtor
        // "por baixo do pano", ignorando o builder e as validações dele:
        Produto semValidacao = new Produto(new ProdutoBuilder());
        System.out.println(semValidacao);
        // Saiu um produto sem nome e com preço 0 — build() nunca foi
        // chamado, então a validação nunca rodou.
    }
}
