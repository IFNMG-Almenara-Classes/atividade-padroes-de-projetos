package comportamentais.observer.exemplo1.antes;

public class ClasseCliente {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.avancarStatus("PAGO");
        pedido.avancarStatus("ENTREGUE");

        // E se o time de marketing quiser saber quando um pedido é
        // entregue, para pedir uma avaliação? É preciso editar Pedido de
        // novo, adicionando mais uma dependência direta — Pedido nunca para
        // de crescer e fica acoplado a todo serviço que alguém queira
        // avisar.
    }
}
