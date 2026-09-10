package criacionais.prototype.exemplo2.antes;

import java.util.ArrayList;
import java.util.List;

public class ClasseCliente {

    public static void main(String[] args) {
        List<String> itensOriginais = new ArrayList<>();
        itensOriginais.add("1x Notebook");

        Pedido pedidoOriginal = new Pedido("Maria", itensOriginais, "Rua das Flores, 123");
        pedidoOriginal.adicionarItem("1x Mouse");
        pedidoOriginal.adicionarItem("1x Teclado");

        // "Repetir pedido": cópia direta, campo por campo, usando só o que
        // está disponível publicamente (mesma ideia do Exemplo 1).
        Pedido pedidoRepetido = new Pedido(
                pedidoOriginal.getCliente(),
                new ArrayList<>(pedidoOriginal.getItens()),
                pedidoOriginal.getEnderecoEntrega()
        );

        pedidoOriginal.imprimirRelatorio();
        pedidoRepetido.imprimirRelatorio();
        // O pedido repetido tem os MESMOS itens, mas o relatório mostra "0
        // item(ns) adicionado(s)" — contadorDeItens é interno, não tem
        // getter, e a cópia manual não tem como saber que ele existe.
    }
}
