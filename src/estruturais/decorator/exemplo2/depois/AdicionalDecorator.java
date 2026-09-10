package estruturais.decorator.exemplo2.depois;

public abstract class AdicionalDecorator extends Bebida {

    protected final Bebida bebida;

    protected AdicionalDecorator(Bebida bebida) {
        this.bebida = bebida;
    }
}
