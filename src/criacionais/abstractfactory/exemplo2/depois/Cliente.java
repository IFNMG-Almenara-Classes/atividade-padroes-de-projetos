package criacionais.abstractfactory.exemplo2.depois;

public class Cliente {

    public static void main(String[] args) {
        System.out.println("--- Tela com tema CLARO ---");
        TelaLogin telaClara = new TelaLogin(new FabricaTemaClaro());
        telaClara.renderizar();

        System.out.println("--- Tela com tema ESCURO ---");
        TelaLogin telaEscura = new TelaLogin(new FabricaTemaEscuro());
        telaEscura.renderizar();
        // Botão e caixa de seleção sempre vêm da mesma fábrica — impossível
        // misturar componentes de temas diferentes.
    }
}
