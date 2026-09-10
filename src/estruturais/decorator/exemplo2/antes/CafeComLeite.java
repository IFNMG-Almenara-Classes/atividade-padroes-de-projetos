package estruturais.decorator.exemplo2.antes;

public class CafeComLeite extends Bebida {

    @Override
    public String getDescricao() {
        return "Café + leite";
    }

    @Override
    public double getPreco() {
        return 5.0 + 1.5;
    }
}
