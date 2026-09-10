package estruturais.composite.exemplo1.depois;

public class Cliente {

    public static void main(String[] args) {
        Categoria eletronicos = new Categoria("Eletrônicos");
        Categoria celulares = new Categoria("Celulares");
        celulares.adicionar(new Produto("Smartphone X", 2000.0));
        celulares.adicionar(new Produto("Capinha", 30.0));
        eletronicos.adicionar(celulares);
        eletronicos.adicionar(new Produto("Notebook", 3500.0));

        // Produto e Categoria são tratados de forma uniforme, como
        // ItemCatalogo — nenhuma recursão manual foi escrita aqui.
        System.out.println("Valor total: R$ " + eletronicos.getPreco());
        System.out.println("Itens: " + eletronicos.contarItens());

        // Uma Categoria vazia, ou até um Produto avulso, também respondem
        // a getPreco()/contarItens() sem tratamento especial:
        ItemCatalogo produtoAvulso = new Produto("Mouse", 80.0);
        System.out.println("Produto avulso: R$ " + produtoAvulso.getPreco());
    }
}
