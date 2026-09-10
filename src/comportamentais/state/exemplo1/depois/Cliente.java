package comportamentais.state.exemplo1.depois;

public class Cliente {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.avancar();
        pedido.avancar();
        pedido.avancar();

        // Cada estado sabe, sozinho, para onde pode ir. Acrescentar
        // "EM_SEPARACAO" entre PAGO e ENVIADO é criar uma classe
        // EstadoEmSeparacao nova e ajustar só o avancar() de EstadoPago —
        // as outras transições continuam intactas.
    }
}
