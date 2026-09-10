package comportamentais.observer.exemplo1.antes;

public class Pedido {

    private String status = "NOVO";

    public void avancarStatus(String novoStatus) {
        this.status = novoStatus;

        // Toda vez que o status muda, o próprio Pedido decide quem precisa
        // ser avisado — e conhece os detalhes de cada um deles.
        new EmailService().enviar("Pedido mudou para: " + novoStatus);
        new EstoqueService().atualizar(novoStatus);

        if (novoStatus.equals("ENTREGUE")) {
            new FinanceiroService().registrarRecebimento();
        }
    }

    public String getStatus() {
        return status;
    }
}
