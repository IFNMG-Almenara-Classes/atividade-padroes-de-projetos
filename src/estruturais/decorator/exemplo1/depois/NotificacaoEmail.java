package estruturais.decorator.exemplo1.depois;

public class NotificacaoEmail implements Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando e-mail: " + mensagem);
    }
}
