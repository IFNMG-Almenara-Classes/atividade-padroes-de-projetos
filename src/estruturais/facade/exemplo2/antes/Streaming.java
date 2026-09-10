package estruturais.facade.exemplo2.antes;

public class Streaming {

    public void ligar() {
        System.out.println("Streaming ligado");
    }

    public void reproduzir(String filme) {
        System.out.println("Reproduzindo \"" + filme + "\"");
    }

    public void desligar() {
        System.out.println("Streaming desligado");
    }
}
