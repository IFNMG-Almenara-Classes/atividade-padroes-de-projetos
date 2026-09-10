package estruturais.facade.exemplo1.depois;

public class EstoqueService {

    public boolean verificarDisponibilidade(String produto, int quantidade) {
        System.out.println("Verificando estoque de " + produto + "...");
        return true;
    }

    public void baixarEstoque(String produto, int quantidade) {
        System.out.println("Baixando " + quantidade + " unidade(s) de " + produto + " do estoque");
    }
}
