package estruturais.adapter.exemplo2.antes;

public class ClasseCliente {

    public static void main(String[] args) {
        SensorFahrenheit sensor = new SensorFahrenheit();

        // Conversão duplicada aqui, e em qualquer outro lugar do sistema
        // que precisar ler a temperatura em Celsius:
        double fahrenheit = sensor.getTemperaturaFahrenheit();
        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("Temperatura: " + celsius + "°C");
    }
}
