package exercicios.exercicio6;

public class ClasseCliente {

    public static void main(String[] args) {
        GeradorRelatorioFiscal gerador = new GeradorRelatorioFiscal();

        System.out.println(gerador.gerar("PDF", "SIMPLES", 50000));
        System.out.println(gerador.gerar("EXCEL", "PRESUMIDO", 50000));
        System.out.println(gerador.gerar("CSV", "REAL", 50000));

        // Formato de saída e regime tributário variam de forma totalmente
        // independente um do outro, mas as duas lógicas moram no mesmo
        // método `gerar()`. Um formato novo (ex.: "JSON") arrisca mexer
        // sem querer na lógica de cálculo de imposto, e vice-versa.
    }
}
