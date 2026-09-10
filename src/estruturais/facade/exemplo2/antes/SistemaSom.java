package estruturais.facade.exemplo2.antes;

public class SistemaSom {

    public void ligar() {
        System.out.println("Sistema de som ligado");
    }

    public void definirVolume(int volume) {
        System.out.println("Volume ajustado para " + volume);
    }

    public void desligar() {
        System.out.println("Sistema de som desligado");
    }
}
