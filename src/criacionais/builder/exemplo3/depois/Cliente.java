package criacionais.builder.exemplo3.depois;

public class Cliente {

    public static void main(String[] args) {
        Produto produto = new Produto.Builder()
                .nome("Teclado Mecânico")
                .preco(350.0)
                .categoria("Periféricos")
                .peso(1.1)
                .build();

        System.out.println(produto);

        // Não tem como fazer "new Produto(...)" aqui: o construtor é
        // private de verdade, e só o Builder aninhado consegue chamá-lo.
        // A linha abaixo não compila:
        // Produto invalido = new Produto(new Produto.Builder());
    }
}
