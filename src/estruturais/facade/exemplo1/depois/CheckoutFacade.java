package estruturais.facade.exemplo1.depois;

public class CheckoutFacade {

    private final EstoqueService estoque = new EstoqueService();
    private final PagamentoService pagamento = new PagamentoService();
    private final FreteService frete = new FreteService();
    private final NotificacaoService notificacao = new NotificacaoService();

    public void finalizarCompra(String produto, int quantidade, double precoUnitario, String cep) {
        if (!estoque.verificarDisponibilidade(produto, quantidade)) {
            System.out.println("Produto indisponível");
            return;
        }

        double valorFrete = frete.calcularFrete(cep);
        double valorTotal = precoUnitario * quantidade + valorFrete;

        pagamento.processar(valorTotal);
        estoque.baixarEstoque(produto, quantidade);
        notificacao.enviar("Seu pedido foi confirmado!");
    }
}
