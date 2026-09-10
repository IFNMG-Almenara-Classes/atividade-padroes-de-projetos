package criacionais.abstractfactory.exemplo2.antes;

public class ClasseCliente {

    public static void main(String[] args) {
        TelaLogin telaLogin = new TelaLogin();

        System.out.println("--- Tela com tema CLARO ---");
        telaLogin.renderizar("CLARO");

        System.out.println("--- Tela com tema ESCURO ---");
        telaLogin.renderizar("ESCURO");
        // O botão fica escuro, mas a caixa de seleção continua clara — a
        // tela mistura os dois temas e fica visualmente inconsistente.
    }
}
