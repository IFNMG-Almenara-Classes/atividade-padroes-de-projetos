package estruturais.decorator.exemplo1.depois;

public class Cliente {

    public static void main(String[] args) {
        Notificacao emailComLog = new NotificacaoComLog(new NotificacaoSMS());
        emailComLog.enviar("Pedido confirmado");

        // Combinações novas não pedem classe nova nenhuma — só empilhar
        // decorators na ordem desejada:
        Notificacao smsUrgenteComLog = new NotificacaoComLog(new NotificacaoUrgente(new NotificacaoSMS()));
        smsUrgenteComLog.enviar("Estoque baixo!");
    }
}
