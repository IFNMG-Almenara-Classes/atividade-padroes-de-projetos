package criacionais.factorymethod.exemplo1.depois;

public class NotificacaoPush implements Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando push: " + mensagem);
    }
}
