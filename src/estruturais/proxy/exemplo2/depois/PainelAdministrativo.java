package estruturais.proxy.exemplo2.depois;

public class PainelAdministrativo implements Painel {

    @Override
    public void excluirTodosPedidos() {
        System.out.println("Todos os pedidos foram excluídos!");
    }
}
