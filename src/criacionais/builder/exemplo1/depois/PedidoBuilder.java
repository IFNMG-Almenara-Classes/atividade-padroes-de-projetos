package criacionais.builder.exemplo1.depois;

public class PedidoBuilder {

    String cliente;
    String itens;
    String enderecoEntrega;
    String formaPagamento;
    String cupomDesconto;
    String observacoes;
    boolean entregaExpressa;

    public PedidoBuilder cliente(String cliente) {
        this.cliente = cliente;
        return this;
    }

    public PedidoBuilder itens(String itens) {
        this.itens = itens;
        return this;
    }

    public PedidoBuilder enderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
        return this;
    }

    public PedidoBuilder formaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
        return this;
    }

    public PedidoBuilder cupomDesconto(String cupomDesconto) {
        this.cupomDesconto = cupomDesconto;
        return this;
    }

    public PedidoBuilder observacoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }

    public PedidoBuilder entregaExpressa(boolean entregaExpressa) {
        this.entregaExpressa = entregaExpressa;
        return this;
    }

    public Pedido build() {
        if (cliente == null || itens == null || enderecoEntrega == null || formaPagamento == null) {
            throw new IllegalStateException("cliente, itens, enderecoEntrega e formaPagamento são obrigatórios");
        }
        return new Pedido(this);
    }
}
