package criacionais.prototype.exemplo3.antes;

import java.util.ArrayList;
import java.util.List;

public class ClasseCliente {

    public static void main(String[] args) {
        List<String> itensOriginais = new ArrayList<>();
        itensOriginais.add("1x Notebook");

        Pedido pedidoOriginal = new Pedido("Maria", itensOriginais, "Rua das Flores, 123");
        pedidoOriginal.definirObservacoes("Entregar após 18h");

        Pedido pedidoRepetido = pedidoOriginal.copiar();

        System.out.println("Original: " + pedidoOriginal);
        System.out.println("Repetido: " + pedidoRepetido);
        // A observação "Entregar após 18h" sumiu no pedido repetido —
        // copiar() nunca foi atualizado depois que "observacoes" foi
        // adicionado à classe.
    }
}
