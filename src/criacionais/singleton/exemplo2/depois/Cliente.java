package criacionais.singleton.exemplo2.depois;

public class Cliente {

    public static void main(String[] args) {
        RelatorioService relatorioService = new RelatorioService();
        EmailService emailService = new EmailService();

        relatorioService.gerarRelatorio();
        emailService.enviarEmailBoasVindas();

        // Um painel administrativo troca o nome da aplicação em runtime...
        ConfiguracaoApp.getInstance().setNomeAplicacao("Loja XPTO Premium");

        System.out.println("--- depois de atualizar o nome da aplicação ---");
        relatorioService.gerarRelatorio();
        // ...e como só existe uma ConfiguracaoApp, o EmailService também
        // enxerga a mudança imediatamente.
        emailService.enviarEmailBoasVindas();
    }
}
