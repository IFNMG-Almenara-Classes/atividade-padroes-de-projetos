package estruturais.decorator.exemplo2.depois;

public class Canela extends AdicionalDecorator {

    public Canela(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + canela";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 0.5;
    }
}
