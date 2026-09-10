package comportamentais.strategy.exemplo1.antes;

public class ClasseCliente {

    public static void main(String[] args) {
        CalculadoraFrete calculadora = new CalculadoraFrete();

        System.out.println("Frete normal: " + calculadora.calcular("NORMAL", 5));
        System.out.println("Frete expresso: " + calculadora.calcular("EXPRESSA", 5));
        System.out.println("Frete retirada: " + calculadora.calcular("RETIRADA", 5));

        // E se surgir um novo tipo de entrega, tipo "MOTOBOY"? É preciso
        // editar CalculadoraFrete e acrescentar mais um "else if" — a
        // classe nunca para de crescer e o risco de quebrar um cálculo
        // existente ao mexer no método aumenta a cada tipo novo.
    }
}
