package criacionais.prototype.exemplo2.antes;

import java.util.List;

public class Pedido {

    private final String cliente;
    private final List<String> itens;
    private final String enderecoEntrega;
    private int contadorDeItens = 0;

    public Pedido(String cliente, List<String> itens, String enderecoEntrega) {
        this.cliente = cliente;
        this.itens = itens;
        this.enderecoEntrega = enderecoEntrega;
    }

    public void adicionarItem(String item) {
        itens.add(item);
        contadorDeItens++;
    }

    public String getCliente() {
        return cliente;
    }

    public List<String> getItens() {
        return itens;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    // contadorDeItens não tem getter — é um detalhe interno, usado só para
    // o relatório abaixo.
    public void imprimirRelatorio() {
        System.out.println("Relatório: " + contadorDeItens + " item(ns) adicionado(s) ao pedido de " + cliente);
    }

    @Override
    public String toString() {
        return "Pedido de " + cliente + " - itens: " + itens + " - entrega: " + enderecoEntrega;
    }
}
