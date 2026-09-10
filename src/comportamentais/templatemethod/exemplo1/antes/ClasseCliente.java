package comportamentais.templatemethod.exemplo1.antes;

public class ClasseCliente {

    public static void main(String[] args) {
        new RelatorioPdf().gerar();
        new RelatorioExcel().gerar();

        // "Abrindo conexão", "Buscando dados" e "Fechando conexão" estão
        // copiados em cada classe de relatório. Um novo formato (ex.: CSV)
        // significa copiar tudo de novo; e se um dia mudar a forma de abrir
        // a conexão, é preciso lembrar de editar todas as cópias.
    }
}
