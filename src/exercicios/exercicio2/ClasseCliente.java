package exercicios.exercicio2;

public class ClasseCliente {

    public static void main(String[] args) {
        Assinatura basica = new Assinatura("BASICO", 5);
        System.out.println(basica);

        // Quais desses booleans e números são o quê? É preciso abrir a
        // classe Assinatura para descobrir a ordem certa dos parâmetros.
        Assinatura empresarial = new Assinatura("EMPRESARIAL", 200, true, "99.9%", 14, 10);
        System.out.println(empresarial);

        // E se alguém trocar "suporte24h" com "sla" sem querer, ou esquecer
        // um parâmetro no meio? O compilador não vai reclamar se os tipos
        // ainda baterem por coincidência — o erro só aparece em produção.
    }
}
