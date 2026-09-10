package exercicios.exercicio5;

public class ClasseCliente {

    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();

        carrinho.aplicarDesconto("BRONZE", 200);
        carrinho.aplicarDesconto("PRATA", 200);
        carrinho.aplicarDesconto("OURO", 200);

        // Duas coisas crescem juntas nesse método, mas por motivos
        // diferentes:
        // 1) Um novo nível de cliente (ex.: "DIAMANTE") exige mais um
        //    "else if" na regra de desconto.
        // 2) Um novo interessado em saber quando um desconto é aplicado
        //    (ex.: um serviço de fidelidade) exige mais uma chamada direta
        //    dentro do mesmo método.
        // Refatore separando essas duas responsabilidades.
    }
}
