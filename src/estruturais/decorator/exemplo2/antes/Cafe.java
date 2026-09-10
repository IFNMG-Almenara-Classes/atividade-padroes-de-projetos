package estruturais.decorator.exemplo2.antes;

public class Cafe extends Bebida {

    @Override
    public String getDescricao() {
        return "Café";
    }

    @Override
    public double getPreco() {
        return 5.0;
    }
}
