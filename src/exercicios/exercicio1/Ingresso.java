package exercicios.exercicio1;

public class Ingresso {

    private final String tipo;
    private final double preco;
    private final String beneficio;

    public Ingresso(String tipo, double preco, String beneficio) {
        this.tipo = tipo;
        this.preco = preco;
        this.beneficio = beneficio;
    }

    @Override
    public String toString() {
        return String.format("Ingresso %s - R$%.2f (%s)", tipo, preco, beneficio);
    }
}
