package estruturais.proxy.exemplo2.depois;

public class PainelAdministrativoProxy implements Painel {

    private final PainelAdministrativo painelReal = new PainelAdministrativo();
    private final String cargoUsuario;

    public PainelAdministrativoProxy(String cargoUsuario) {
        this.cargoUsuario = cargoUsuario;
    }

    @Override
    public void excluirTodosPedidos() {
        if (!cargoUsuario.equals("ADMIN")) {
            System.out.println("Acesso negado: usuário sem permissão.");
            return;
        }
        painelReal.excluirTodosPedidos();
    }
}
