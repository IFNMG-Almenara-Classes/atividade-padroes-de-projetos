package criacionais.prototype.exemplo1.depois;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    public static void main(String[] args) {
        List<String> itensOriginais = new ArrayList<>();
        itensOriginais.add("1x Notebook");
        itensOriginais.add("1x Mouse");

        Pedido pedidoOriginal = new Pedido("Maria", itensOriginais, "Rua das Flores, 123");

        // "Repetir pedido" agora é só chamar copiar() — Pedido sabe,
        // internamente, quais campos precisam de cópia profunda.
        Pedido pedidoRepetido = pedidoOriginal.copiar();
        pedidoRepetido.getItens().add("1x Fone de Ouvido");

        System.out.println("Original: " + pedidoOriginal);
        System.out.println("Repetido: " + pedidoRepetido);
        // O pedido original permanece intacto — as listas de itens são
        // independentes.
    }
}
