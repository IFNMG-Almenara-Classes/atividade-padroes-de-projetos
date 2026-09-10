package estruturais.decorator.exemplo1.antes;

public class ClasseCliente {

    public static void main(String[] args) {
        Notificacao emailComLog = new NotificacaoEmailComLog();
        emailComLog.enviar("Pedido confirmado");

        Notificacao smsComLog = new NotificacaoSMSComLog();
        smsComLog.enviar("Estoque baixo!");

        // E se precisarmos de uma versão "urgente" (prefixo [URGENTE]),
        // com ou sem log, para e-mail E para SMS? Seriam mais 4 classes
        // (NotificacaoEmailUrgente, NotificacaoSMSUrgente,
        // NotificacaoEmailComLogUrgente, NotificacaoSMSComLogUrgente...).
        // A quantidade de classes cresce exponencialmente a cada
        // combinação nova.
    }
}
