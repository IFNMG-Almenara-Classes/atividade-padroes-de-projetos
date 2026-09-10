package estruturais.composite.exemplo1.depois;

import java.util.ArrayList;
import java.util.List;

public class Categoria implements ItemCatalogo {

    private final String nome;
    private final List<ItemCatalogo> itens = new ArrayList<>();

    public Categoria(String nome) {
        this.nome = nome;
    }

    public void adicionar(ItemCatalogo item) {
        itens.add(item);
    }

    @Override
    public double getPreco() {
        double total = 0;
        for (ItemCatalogo item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    @Override
    public int contarItens() {
        int total = 0;
        for (ItemCatalogo item : itens) {
            total += item.contarItens();
        }
        return total;
    }
}
