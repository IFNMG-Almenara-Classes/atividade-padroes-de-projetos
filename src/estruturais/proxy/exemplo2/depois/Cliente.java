package estruturais.proxy.exemplo2.depois;

public class Cliente {

    public static void main(String[] args) {
        Painel painelVendedor = new PainelAdministrativoProxy("VENDEDOR");
        painelVendedor.excluirTodosPedidos(); // negado

        Painel painelAdmin = new PainelAdministrativoProxy("ADMIN");
        painelAdmin.excluirTodosPedidos(); // executa
    }
}
