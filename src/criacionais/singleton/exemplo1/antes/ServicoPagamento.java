package criacionais.singleton.exemplo1.antes;

public class ServicoPagamento {

    private final Logger logger = new Logger();

    public void processarPagamento(double valor) {
        logger.registrar("Pagamento processado: R$ " + valor);
    }

    public Logger getLogger() {
        return logger;
    }
}
