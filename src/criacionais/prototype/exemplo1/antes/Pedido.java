package criacionais.prototype.exemplo1.antes;

import java.util.List;

public class Pedido {

    private final String cliente;
    private final List<String> itens;
    private final String enderecoEntrega;

    public Pedido(String cliente, List<String> itens, String enderecoEntrega) {
        this.cliente = cliente;
        this.itens = itens;
        this.enderecoEntrega = enderecoEntrega;
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

    @Override
    public String toString() {
        return "Pedido de " + cliente + " - itens: " + itens + " - entrega: " + enderecoEntrega;
    }
}
