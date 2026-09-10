package criacionais.prototype.exemplo3.depois;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    public static void main(String[] args) {
        List<String> itensOriginais = new ArrayList<>();
        itensOriginais.add("1x Notebook");

        Pedido pedidoOriginal = new Pedido("Maria", itensOriginais, "Rua das Flores, 123");
        pedidoOriginal.definirObservacoes("Entregar após 18h");

        Pedido pedidoRepetido = pedidoOriginal.clone();

        System.out.println("Original: " + pedidoOriginal);
        System.out.println("Repetido: " + pedidoRepetido);
        // A observação foi preservada — clone() não depende de "lembrar"
        // de copiar cada campo manualmente.
    }
}
