package comportamentais.strategy.exemplo1.depois;

public class FreteExpresso implements EstrategiaFrete {

    @Override
    public double calcular(double peso) {
        return peso * 1.2 + 10;
    }
}
