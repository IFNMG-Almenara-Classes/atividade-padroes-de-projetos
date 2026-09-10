package criacionais.prototype.exemplo2.depois;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    public static void main(String[] args) {
        List<String> itensOriginais = new ArrayList<>();
        itensOriginais.add("1x Notebook");

        Pedido pedidoOriginal = new Pedido("Maria", itensOriginais, "Rua das Flores, 123");
        pedidoOriginal.adicionarItem("1x Mouse");
        pedidoOriginal.adicionarItem("1x Teclado");

        Pedido pedidoRepetido = pedidoOriginal.copiar();

        pedidoOriginal.imprimirRelatorio();
        pedidoRepetido.imprimirRelatorio();
        // Os dois relatórios mostram "2 item(ns) adicionado(s)" —
        // contadorDeItens foi copiado corretamente, mesmo sem getter, só
        // porque copiar() está dentro da própria classe Pedido.
    }
}
