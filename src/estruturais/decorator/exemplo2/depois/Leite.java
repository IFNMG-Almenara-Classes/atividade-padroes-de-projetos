package estruturais.decorator.exemplo2.depois;

public class Leite extends AdicionalDecorator {

    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + leite";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 1.5;
    }
}
