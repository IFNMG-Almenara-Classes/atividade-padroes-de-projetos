package estruturais.composite.exemplo2.depois;

public class Cliente {

    public static void main(String[] args) {
        Pasta raiz = new Pasta("projeto");
        Pasta src = new Pasta("src");
        src.adicionar(new Arquivo("Main.java", 4));
        src.adicionar(new Arquivo("Util.java", 2));
        raiz.adicionar(src);
        raiz.adicionar(new Arquivo("README.md", 1));

        // Uma única implementação de exibir()/getTamanhoKb() cobre
        // arquivos e pastas, em qualquer nível de aninhamento.
        raiz.exibir("");
        System.out.println("Tamanho total: " + raiz.getTamanhoKb() + " KB");
    }
}
