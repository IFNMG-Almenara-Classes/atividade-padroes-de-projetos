package estruturais.decorator.exemplo2.depois;

public class Chocolate extends AdicionalDecorator {

    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + chocolate";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 2.0;
    }
}
