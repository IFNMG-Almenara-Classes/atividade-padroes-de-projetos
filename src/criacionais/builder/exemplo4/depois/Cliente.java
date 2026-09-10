package criacionais.builder.exemplo4.depois;

public class Cliente {

    public static void main(String[] args) {
        Produto produto = new Produto.Builder()
                .nome("5este")
                .peso(1.2)
                .descricao("asdasdasd")

                .build();

        System.out.println(produto);
        // Do lado de quem usa, nada muda em relação ao Exemplo 3 — a
        // diferença é só no design interno de Produto/Builder.
    }
}
