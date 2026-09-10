package criacionais.singleton.exemplo1.antes;

public class ServicoPedido {

    private final Logger logger = new Logger();

    public void criarPedido(String descricao) {
        logger.registrar("Pedido criado: " + descricao);
    }

    public Logger getLogger() {
        return logger;
    }
}
