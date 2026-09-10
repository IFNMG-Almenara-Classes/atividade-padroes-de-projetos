package estruturais.proxy.exemplo2.antes;

public class ClasseCliente {

    public static void main(String[] args) {
        PainelAdministrativo painel = new PainelAdministrativo();
        String cargoUsuario = "VENDEDOR";

        // Verificação de permissão feita na mão, no local de uso — fácil
        // de esquecer em outro lugar do sistema que também chame esse
        // método.
        if (cargoUsuario.equals("ADMIN")) {
            painel.excluirTodosPedidos();
        } else {
            System.out.println("Acesso negado: usuário sem permissão.");
        }
    }
}
