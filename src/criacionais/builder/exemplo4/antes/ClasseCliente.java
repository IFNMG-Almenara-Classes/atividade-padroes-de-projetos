package criacionais.builder.exemplo4.antes;

public class ClasseCliente {

    public static void main(String[] args) {
        // nome, descricao e categoria são todos String — fácil trocar a
        // ordem sem que o compilador acuse nada. Aqui, descricao e
        // categoria saem invertidos por engano:
        Produto produto = new Produto("Teclado Mecânico", 350.0, "Periféricos", "Teclado com switches azuis", 1.1);
        System.out.println(produto);

        // Não existe Builder nem validação nenhuma: dá para criar um
        // produto completamente inválido sem que nada acuse o problema.
        Produto invalido = new Produto(null, 0, null, null, 0);
        System.out.println(invalido);
    }
}
