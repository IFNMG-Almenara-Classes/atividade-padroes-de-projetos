package estruturais.composite.exemplo1.antes;

public class ClasseCliente {

    public static void main(String[] args) {
        Categoria eletronicos = new Categoria("Eletrônicos");
        Categoria celulares = new Categoria("Celulares");
        celulares.adicionarProduto(new Produto("Smartphone X", 2000.0));
        celulares.adicionarProduto(new Produto("Capinha", 30.0));
        eletronicos.adicionarSubcategoria(celulares);
        eletronicos.adicionarProduto(new Produto("Notebook", 3500.0));

        System.out.println("Valor total: R$ " + calcularValorTotal(eletronicos));
        System.out.println("Itens: " + contarItens(eletronicos));

        // Cada operação nova sobre a árvore (valor total, contagem,
        // listagem...) exige escrever de novo a mesma recursão manual
        // (percorrer produtos, depois subcategorias). E não dá para chamar
        // essas funções passando só um Produto avulso — ele não é uma
        // Categoria.
    }

    static double calcularValorTotal(Categoria categoria) {
        double total = 0;
        for (Produto produto : categoria.getProdutos()) {
            total += produto.getPreco();
        }
        for (Categoria sub : categoria.getSubcategorias()) {
            total += calcularValorTotal(sub);
        }
        return total;
    }

    static int contarItens(Categoria categoria) {
        int total = categoria.getProdutos().size();
        for (Categoria sub : categoria.getSubcategorias()) {
            total += contarItens(sub);
        }
        return total;
    }
}
