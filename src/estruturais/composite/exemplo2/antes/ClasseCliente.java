package estruturais.composite.exemplo2.antes;

public class ClasseCliente {

    public static void main(String[] args) {
        Pasta raiz = new Pasta("projeto");
        Pasta src = new Pasta("src");
        src.adicionarArquivo(new Arquivo("Main.java", 4));
        src.adicionarArquivo(new Arquivo("Util.java", 2));
        raiz.adicionarSubpasta(src);
        raiz.adicionarArquivo(new Arquivo("README.md", 1));

        System.out.println("Tamanho total: " + calcularTamanhoTotal(raiz) + " KB");
        exibirArvore(raiz, "");

        // calcularTamanhoTotal e exibirArvore repetem a mesma estrutura de
        // recursão (percorrer arquivos, depois subpastas). Uma terceira
        // operação (contar arquivos, buscar por nome...) exigiria escrever
        // essa recursão pela quarta vez.
    }

    static long calcularTamanhoTotal(Pasta pasta) {
        long total = 0;
        for (Arquivo arquivo : pasta.getArquivos()) {
            total += arquivo.getTamanhoKb();
        }
        for (Pasta sub : pasta.getSubpastas()) {
            total += calcularTamanhoTotal(sub);
        }
        return total;
    }

    static void exibirArvore(Pasta pasta, String prefixo) {
        System.out.println(prefixo + pasta.getNome() + "/");
        for (Arquivo arquivo : pasta.getArquivos()) {
            System.out.println(prefixo + "  " + arquivo.getNome() + " (" + arquivo.getTamanhoKb() + " KB)");
        }
        for (Pasta sub : pasta.getSubpastas()) {
            exibirArvore(sub, prefixo + "  ");
        }
    }
}
