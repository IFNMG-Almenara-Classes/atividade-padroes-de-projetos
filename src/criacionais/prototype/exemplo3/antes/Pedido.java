package criacionais.prototype.exemplo3.antes;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private final String cliente;
    private final List<String> itens;
    private final String enderecoEntrega;
    private String observacoes = "";

    public Pedido(String cliente, List<String> itens, String enderecoEntrega) {
        this.cliente = cliente;
        this.itens = itens;
        this.enderecoEntrega = enderecoEntrega;
    }

    public void definirObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public List<String> getItens() {
        return itens;
    }

    // copiar() foi escrito quando Pedido só tinha cliente, itens e
    // enderecoEntrega. Quando "observacoes" foi adicionado à classe,
    // ninguém lembrou de atualizar este método.
    public Pedido copiar() {
        return new Pedido(this.cliente, new ArrayList<>(this.itens), this.enderecoEntrega);
    }

    @Override
    public String toString() {
        return "Pedido de " + cliente + " - itens: " + itens + " - obs: \"" + observacoes + "\"";
    }
}
