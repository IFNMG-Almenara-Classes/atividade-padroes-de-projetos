package criacionais.builder.exemplo1.depois;

public class Pedido {

    private final String cliente;
    private final String itens;
    private final String enderecoEntrega;
    private final String formaPagamento;
    private final String cupomDesconto;
    private final String observacoes;
    private final boolean entregaExpressa;

    Pedido(PedidoBuilder builder) {
        this.cliente = builder.cliente;
        this.itens = builder.itens;
        this.enderecoEntrega = builder.enderecoEntrega;
        this.formaPagamento = builder.formaPagamento;
        this.cupomDesconto = builder.cupomDesconto;
        this.observacoes = builder.observacoes;
        this.entregaExpressa = builder.entregaExpressa;
    }

    @Override
    public String toString() {
        return "Pedido de " + cliente + "\n"
                + "Itens: " + itens + "\n"
                + "Endereço: " + enderecoEntrega + "\n"
                + "Pagamento: " + formaPagamento + "\n"
                + "Cupom: " + cupomDesconto + "\n"
                + "Observações: " + observacoes + "\n"
                + "Entrega expressa: " + entregaExpressa;
    }
}
