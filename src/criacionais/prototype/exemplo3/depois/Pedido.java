package criacionais.prototype.exemplo3.depois;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Cloneable {

    private final String cliente;
    private List<String> itens;
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

    @Override
    public Pedido clone() {
        try {
            Pedido copia = (Pedido) super.clone();
            // super.clone() já copiou cliente, enderecoEntrega e
            // observacoes automaticamente — mesmo "observacoes" tendo sido
            // adicionado à classe bem depois de clone() já existir, ninguém
            // precisou lembrar de atualizar nada aqui. Só a lista de itens
            // precisa de cuidado especial (cópia profunda):
            copia.itens = new ArrayList<>(this.itens);
            return copia;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override
    public String toString() {
        return "Pedido de " + cliente + " - itens: " + itens + " - obs: \"" + observacoes + "\"";
    }
}
