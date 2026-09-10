package criacionais.factorymethod.exemplo1.antes;

public class PedidoService {

    public void confirmarPedido(String tipoNotificacao) {
        String mensagem = "Seu pedido foi confirmado!";

        if (tipoNotificacao.equals("EMAIL")) {
            NotificacaoEmail notificacao = new NotificacaoEmail();
            notificacao.enviarEmail(mensagem);
        } else if (tipoNotificacao.equals("SMS")) {
            NotificacaoSMS notificacao = new NotificacaoSMS();
            notificacao.enviarSms(mensagem);
        } else {
            throw new IllegalArgumentException("Tipo de notificação desconhecido: " + tipoNotificacao);
        }
        // Cada canal novo (push, WhatsApp...) exige mais um "else if" aqui.
    }
}
