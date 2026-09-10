package criacionais.singleton.exemplo2.antes;

public class ClasseCliente {

    public static void main(String[] args) {
        RelatorioService relatorioService = new RelatorioService();
        EmailService emailService = new EmailService();

        relatorioService.gerarRelatorio();
        emailService.enviarEmailBoasVindas();

        // Um painel administrativo troca o nome da aplicação em runtime...
        relatorioService.getConfiguracao().setNomeAplicacao("Loja XPTO Premium");

        System.out.println("--- depois de atualizar o nome da aplicação ---");
        relatorioService.gerarRelatorio();
        // ...mas cada serviço tem sua própria cópia da configuração: a
        // mudança não se propaga para o EmailService.
        emailService.enviarEmailBoasVindas();
    }
}
