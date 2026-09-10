package exercicios.exercicio1;

public class ClasseCliente {

    public static void main(String[] args) {
        VendaIngressos venda = new VendaIngressos();

        System.out.println(venda.emitir("VIP"));
        System.out.println(venda.emitir("COMUM"));
        System.out.println(venda.emitir("MEIA"));

        // O organizador do evento quer lançar um novo tipo de ingresso,
        // "ESTUDANTE" (desconto de 30% sobre o comum, exige carteirinha).
        // Refatore o código para que isso seja possível sem reescrever
        // VendaIngressos.emitir() a cada tipo novo.
    }
}
