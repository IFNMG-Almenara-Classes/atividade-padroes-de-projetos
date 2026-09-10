package comportamentais.strategy.exemplo1.depois;

public class FreteNormal implements EstrategiaFrete {

    @Override
    public double calcular(double peso) {
        return peso * 0.5;
    }
}
