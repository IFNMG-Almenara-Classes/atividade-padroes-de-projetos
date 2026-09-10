package exercicios.exercicio5;

public class CarrinhoCompras {

    public double aplicarDesconto(String tipoCliente, double valorTotal) {
        double valorFinal;

        // Regra de desconto por tipo de cliente, tudo no mesmo método.
        if (tipoCliente.equals("BRONZE")) {
            valorFinal = valorTotal;
        } else if (tipoCliente.equals("PRATA")) {
            valorFinal = valorTotal * 0.95;
        } else if (tipoCliente.equals("OURO")) {
            valorFinal = valorTotal * 0.85;
        } else {
            throw new IllegalArgumentException("Tipo de cliente desconhecido: " + tipoCliente);
        }

        // E, no mesmo lugar, os serviços que precisam saber que um desconto
        // foi aplicado são chamados diretamente.
        new EmailMarketingService().enviar(valorFinal);
        new AuditoriaService().registrar(valorFinal);
        new ErpService().atualizar(valorFinal);

        return valorFinal;
    }
}
