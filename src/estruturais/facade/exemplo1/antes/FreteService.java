package estruturais.facade.exemplo1.antes;

public class FreteService {

    public double calcularFrete(String cep) {
        System.out.println("Calculando frete para o CEP " + cep);
        return 25.0;
    }
}
