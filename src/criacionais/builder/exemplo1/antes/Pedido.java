package criacionais.builder.exemplo1.antes;

public class Pedido {

    private final String cliente;
    private final String itens;
    private final String enderecoEntrega;
    private final String formaPagamento;
    private final String cupomDesconto;
    private final String observacoes;
    private final boolean entregaExpressa;

    public Pedido(String cliente, String itens, String enderecoEntrega, String formaPagamento,
                  String cupomDesconto, String observacoes, boolean entregaExpressa) {
        this.cliente = cliente;
        this.itens = itens;
        this.enderecoEntrega = enderecoEntrega;
        this.formaPagamento = formaPagamento;
        this.cupomDesconto = cupomDesconto;
        this.observacoes = observacoes;
        this.entregaExpressa = entregaExpressa;
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
