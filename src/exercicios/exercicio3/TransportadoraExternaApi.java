package exercicios.exercicio3;

// Biblioteca de terceiros — não pode ser alterada. Segue seu próprio
// contrato, diferente do que o sistema interno espera: recebe "trackingId"
// e devolve um código numérico.
public class TransportadoraExternaApi {

    public int getStatusCode(String trackingId) {
        // Simulação: em uma API real isso viria de uma chamada HTTP.
        if (trackingId.startsWith("COL")) {
            return 1;
        } else if (trackingId.startsWith("TRA")) {
            return 2;
        } else if (trackingId.startsWith("ENT")) {
            return 3;
        }
        return 0;
    }
}
