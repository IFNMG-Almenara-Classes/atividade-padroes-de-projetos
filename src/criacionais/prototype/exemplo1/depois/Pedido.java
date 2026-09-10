package criacionais.prototype.exemplo1.depois;

import java.util.ArrayList;
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

    public List<String> getItens() {
        return itens;
    }

    public Pedido copiar() {
        // Implementação direta: montamos a cópia na mão, decidindo campo a
        // campo o que copiar. A lista de itens precisa de uma lista NOVA,
        // senão original e cópia continuariam compartilhando a mesma List.
        return new Pedido(this.cliente, new ArrayList<>(this.itens), this.enderecoEntrega);
    }

    @Override
    public String toString() {
        return "Pedido de " + cliente + " - itens: " + itens + " - entrega: " + enderecoEntrega;
    }
}
