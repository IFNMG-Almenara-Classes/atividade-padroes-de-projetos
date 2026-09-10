package estruturais.facade.exemplo1.antes;

public class ClasseCliente {

    public static void main(String[] args) {
        EstoqueService estoque = new EstoqueService();
        PagamentoService pagamento = new PagamentoService();
        FreteService frete = new FreteService();
        NotificacaoService notificacao = new NotificacaoService();

        String produto = "Notebook";
        int quantidade = 1;
        double precoUnitario = 3500.0;
        String cep = "01310-100";

        if (!estoque.verificarDisponibilidade(produto, quantidade)) {
            System.out.println("Produto indisponível");
            return;
        }

        double valorFrete = frete.calcularFrete(cep);
        double valorTotal = precoUnitario * quantidade + valorFrete;

        pagamento.processar(valorTotal);
        estoque.baixarEstoque(produto, quantidade);
        notificacao.enviar("Seu pedido foi confirmado!");

        // Toda vez que outro lugar do sistema precisar fechar um pedido,
        // essa sequência inteira (na ordem certa) precisa ser repetida.
    }
}
