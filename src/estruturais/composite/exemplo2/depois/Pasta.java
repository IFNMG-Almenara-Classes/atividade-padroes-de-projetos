package estruturais.composite.exemplo2.depois;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements ItemSistemaArquivos {

    private final String nome;
    private final List<ItemSistemaArquivos> itens = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public void adicionar(ItemSistemaArquivos item) {
        itens.add(item);
    }

    @Override
    public long getTamanhoKb() {
        long total = 0;
        for (ItemSistemaArquivos item : itens) {
            total += item.getTamanhoKb();
        }
        return total;
    }

    @Override
    public void exibir(String prefixo) {
        System.out.println(prefixo + nome + "/");
        for (ItemSistemaArquivos item : itens) {
            item.exibir(prefixo + "  ");
        }
    }
}
