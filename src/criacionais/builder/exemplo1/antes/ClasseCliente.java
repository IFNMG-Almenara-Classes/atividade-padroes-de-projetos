package criacionais.builder.exemplo1.antes;

public class ClasseCliente {

    public static void main(String[] args) {
        // 7 parâmetros, vários do mesmo tipo (String) — fácil trocar a
        // ordem sem perceber. Aqui, cupomDesconto e observacoes foram
        // trocados de lugar por engano:
        Pedido pedido = new Pedido(
                "Maria",
                "1x Notebook, 1x Mouse",
                "Rua das Flores, 123",
                "PIX",
                "Entregar após 18h", // <- isso é uma observação, não um cupom!
                "BEMVINDO10",        // <- isso é um cupom, não uma observação!
                true
        );

        System.out.println(pedido);
        // O compilador não acusa nada — os dois parâmetros são String — mas
        // o pedido sai com o cupom e a observação trocados.
    }
}
