package comportamentais.observer.exemplo1.depois;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private final List<ObservadorPedido> observadores = new ArrayList<>();
    private String status = "NOVO";

    public void adicionarObservador(ObservadorPedido observador) {
        observadores.add(observador);
    }

    public void removerObservador(ObservadorPedido observador) {
        observadores.remove(observador);
    }

    public void avancarStatus(String novoStatus) {
        this.status = novoStatus;
        for (ObservadorPedido observador : observadores) {
            observador.atualizar(novoStatus);
        }
    }

    public String getStatus() {
        return status;
    }
}
