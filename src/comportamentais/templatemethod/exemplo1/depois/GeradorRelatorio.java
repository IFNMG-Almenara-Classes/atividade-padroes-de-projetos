package comportamentais.templatemethod.exemplo1.depois;

public abstract class GeradorRelatorio {

    public final void gerar() {
        abrirConexao();
        buscarDados();
        formatar();
        fecharConexao();
    }

    private void abrirConexao() {
        System.out.println("Abrindo conexão com o banco...");
    }

    private void buscarDados() {
        System.out.println("Buscando dados...");
    }

    protected abstract void formatar();

    private void fecharConexao() {
        System.out.println("Fechando conexão.");
    }
}
