package estruturais.composite.exemplo1.antes;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

    private final String nome;
    private final List<Produto> produtos = new ArrayList<>();
    private final List<Categoria> subcategorias = new ArrayList<>();

    public Categoria(String nome) {
        this.nome = nome;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void adicionarSubcategoria(Categoria subcategoria) {
        subcategorias.add(subcategoria);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public List<Categoria> getSubcategorias() {
        return subcategorias;
    }
}
