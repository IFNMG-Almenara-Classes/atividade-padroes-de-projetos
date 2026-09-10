package comportamentais.strategy.exemplo1.antes;

public class CalculadoraFrete {

    public double calcular(String tipoEntrega, double peso) {
        if (tipoEntrega.equals("NORMAL")) {
            return peso * 0.5;
        } else if (tipoEntrega.equals("EXPRESSA")) {
            return peso * 1.2 + 10;
        } else if (tipoEntrega.equals("RETIRADA")) {
            return 0;
        } else {
            throw new IllegalArgumentException("Tipo de entrega desconhecido: " + tipoEntrega);
        }
    }
}
