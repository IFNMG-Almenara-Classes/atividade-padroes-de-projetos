package estruturais.decorator.exemplo2.depois;

public class Cliente {

    public static void main(String[] args) {
        Bebida pedido = new Canela(new Chocolate(new Leite(new Cafe())));
        System.out.println(pedido.getDescricao() + " - R$ " + pedido.getPreco());

        // Qualquer combinação de adicionais é só uma questão de empilhar
        // decorators — nenhuma classe nova é necessária.
        Bebida outroPedido = new Canela(new Leite(new Cafe()));
        System.out.println(outroPedido.getDescricao() + " - R$ " + outroPedido.getPreco());
    }
}
