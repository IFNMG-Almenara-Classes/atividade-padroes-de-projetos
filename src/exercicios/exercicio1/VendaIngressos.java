package exercicios.exercicio1;

public class VendaIngressos {

    public Ingresso emitir(String tipo) {
        if (tipo.equals("VIP")) {
            return new Ingresso("VIP", 300.0, "acesso ao camarote + brinde exclusivo");
        } else if (tipo.equals("COMUM")) {
            return new Ingresso("COMUM", 100.0, "acesso à pista");
        } else if (tipo.equals("MEIA")) {
            return new Ingresso("MEIA", 50.0, "acesso à pista, exige comprovante na entrada");
        } else {
            throw new IllegalArgumentException("Tipo de ingresso desconhecido: " + tipo);
        }
    }
}
