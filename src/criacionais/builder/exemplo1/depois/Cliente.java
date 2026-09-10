package criacionais.builder.exemplo1.depois;

public class Cliente {

    public static void main(String[] args) {
        Pedido pedido = new PedidoBuilder()
                .cliente("Maria")
                .itens("1x Notebook, 1x Mouse")
                .enderecoEntrega("Rua das Flores, 123")
                .formaPagamento("PIX")
                .cupomDesconto("BEMVINDO10")
                .observacoes("Entregar após 18h")
                .entregaExpressa(true)
                .build();

        System.out.println(pedido);

        System.out.println();

        // Campos opcionais podem ser simplesmente omitidos, sem precisar de
        // um construtor extra sem cupom/observações/entrega expressa:
        Pedido pedidoSimples = new PedidoBuilder()
                .cliente("João")
                .itens("1x Teclado")
                .enderecoEntrega("Av. Central, 456")
                .formaPagamento("CARTAO")
                .build();

        System.out.println(pedidoSimples);
    }
}
