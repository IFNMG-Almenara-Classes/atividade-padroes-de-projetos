package estruturais.decorator.exemplo2.antes;

public class ClasseCliente {

    public static void main(String[] args) {
        Bebida pedido = new CafeComLeiteEChocolate();
        System.out.println(pedido.getDescricao() + " - R$ " + pedido.getPreco());

        // Não existe uma classe para "café com canela" nem para "café com
        // leite e canela, sem chocolate" — seria preciso criar uma classe
        // nova para cada combinação de adicionais.
    }
}
