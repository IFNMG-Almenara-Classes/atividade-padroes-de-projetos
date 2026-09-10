package comportamentais.state.exemplo1.antes;

public class Pedido {

    private String status = "NOVO";

    public void avancar() {
        if (status.equals("NOVO")) {
            status = "PAGO";
            System.out.println("Pedido pago.");
        } else if (status.equals("PAGO")) {
            status = "ENVIADO";
            System.out.println("Pedido enviado.");
        } else if (status.equals("ENVIADO")) {
            status = "ENTREGUE";
            System.out.println("Pedido entregue.");
        } else if (status.equals("ENTREGUE")) {
            throw new IllegalStateException("Pedido entregue não pode avançar mais.");
        } else {
            throw new IllegalStateException("Status desconhecido: " + status);
        }
    }

    public void cancelar() {
        if (status.equals("ENTREGUE")) {
            throw new IllegalStateException("Pedido entregue não pode ser cancelado.");
        }
        status = "CANCELADO";
        System.out.println("Pedido cancelado.");
    }

    public String getStatus() {
        return status;
    }
}
