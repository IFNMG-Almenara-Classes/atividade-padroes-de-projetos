package comportamentais.strategy.exemplo1.depois;

public class CalculadoraFrete {

    private final EstrategiaFrete estrategia;

    public CalculadoraFrete(EstrategiaFrete estrategia) {
        this.estrategia = estrategia;
    }

    public double calcular(double peso) {
        return estrategia.calcular(peso);
    }
}
