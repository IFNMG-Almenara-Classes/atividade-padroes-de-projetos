package comportamentais.strategy.exemplo1.depois;

public class Cliente {

    public static void main(String[] args) {
        CalculadoraFrete freteNormal = new CalculadoraFrete(new FreteNormal());
        System.out.println("Frete normal: " + freteNormal.calcular(5));

        CalculadoraFrete freteExpresso = new CalculadoraFrete(new FreteExpresso());
        System.out.println("Frete expresso: " + freteExpresso.calcular(5));

        // Um novo tipo de entrega é só uma classe nova implementando
        // EstrategiaFrete — nenhuma classe existente precisa ser alterada.
        // Como a interface tem um único método, a estratégia pode até ser
        // passada como lambda, sem precisar nem de uma classe:
        CalculadoraFrete freteMotoboy = new CalculadoraFrete(peso -> peso * 2 + 5);
        System.out.println("Frete motoboy: " + freteMotoboy.calcular(5));
    }
}
