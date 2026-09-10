package criacionais.builder.exemplo2.antes;

public class ClasseCliente {

    public static void main(String[] args) {
        // O que significa cada "true"/"false" aqui? É preciso contar a
        // posição e conferir a assinatura do construtor para saber a que
        // ingrediente cada booleano se refere.
        Hamburguer xBacon = new Hamburguer("Brioche", "Carne Bovina", true, true, false, false, false, true);
        System.out.println(xBacon);

        // Alguém quis um lanche só com queijo e cebola, mas trocou a posição
        // de "cebola" com "tomate" sem perceber — o pedido sai errado:
        Hamburguer xSalada = new Hamburguer("Integral", "Carne Bovina", true, false, false, true, false, false);
        System.out.println(xSalada);

        // E se o cliente quisesse picles ou ovo? Não dá — esses ingredientes
        // nem existem no construtor. Seria preciso alterar a classe toda vez
        // que surgisse um ingrediente extra novo.
    }
}
