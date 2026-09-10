package criacionais.prototype.exemplo1.antes;

import java.util.ArrayList;
import java.util.List;

public class ClasseCliente {

    public static void main(String[] args) {
        List<String> itensOriginais = new ArrayList<>();
        itensOriginais.add("1x Notebook");
        itensOriginais.add("1x Mouse");

        Pedido pedidoOriginal = new Pedido("Maria", itensOriginais, "Rua das Flores, 123");

        // "Repetir pedido": cria um Pedido novo copiando os campos na mão...
        Pedido pedidoRepetido = new Pedido(
                pedidoOriginal.getCliente(),
                pedidoOriginal.getItens(),
                pedidoOriginal.getEnderecoEntrega()
        );

        // ...mas o Pedido novo continua com a MESMA lista de itens do
        // original (cópia rasa) — adicionar um item aqui também afeta o
        // pedido original, sem querer:
        pedidoRepetido.getItens().add("1x Fone de Ouvido");

        System.out.println("Original: " + pedidoOriginal);
        System.out.println("Repetido: " + pedidoRepetido);
        // O pedido original ganhou um fone de ouvido que ele nunca teve!
    }
}
