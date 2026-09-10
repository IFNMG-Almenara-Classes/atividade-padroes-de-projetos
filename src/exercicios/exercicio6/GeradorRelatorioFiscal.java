package exercicios.exercicio6;

public class GeradorRelatorioFiscal {

    public String gerar(String formato, String regimeTributario, double receita) {
        // Primeira variação: quanto de imposto calcular, de acordo com o
        // regime tributário.
        double imposto;
        if (regimeTributario.equals("SIMPLES")) {
            imposto = receita * 0.06;
        } else if (regimeTributario.equals("PRESUMIDO")) {
            imposto = receita * 0.11;
        } else if (regimeTributario.equals("REAL")) {
            imposto = receita * 0.15;
        } else {
            throw new IllegalArgumentException("Regime tributário desconhecido: " + regimeTributario);
        }

        String conteudo = "Receita: " + receita + " | Imposto: " + imposto;

        // Segunda variação, independente da primeira: como formatar a
        // saída, de acordo com o formato pedido.
        if (formato.equals("PDF")) {
            return "[PDF] " + conteudo;
        } else if (formato.equals("EXCEL")) {
            return "[EXCEL] " + conteudo;
        } else if (formato.equals("CSV")) {
            return conteudo.replace(" | ", ";").replace(": ", "=");
        } else {
            throw new IllegalArgumentException("Formato desconhecido: " + formato);
        }
    }
}
