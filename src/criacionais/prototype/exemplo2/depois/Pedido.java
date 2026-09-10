package criacionais.prototype.exemplo2.depois;

import java.util.ArrayList;
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

    public List<String> getItens() {
        return itens;
    }

    // contadorDeItens continua sem getter — não faz parte da API pública,
    // só é usado aqui dentro para o relatório.
    public void imprimirRelatorio() {
        System.out.println("Relatório: " + contadorDeItens + " item(ns) adicionado(s) ao pedido de " + cliente);
    }

    public Pedido copiar() {
        Pedido copia = new Pedido(this.cliente, new ArrayList<>(this.itens), this.enderecoEntrega);
        // Mesmo sem getter, copiar() está DENTRO da classe Pedido — em
        // Java, o acesso private vale por classe, não por instância, então
        // dá para ler this.contadorDeItens e escrever direto no campo de
        // "copia".
        copia.contadorDeItens = this.contadorDeItens;
        return copia;
    }

    @Override
    public String toString() {
        return "Pedido de " + cliente + " - itens: " + itens + " - entrega: " + enderecoEntrega;
    }
}
