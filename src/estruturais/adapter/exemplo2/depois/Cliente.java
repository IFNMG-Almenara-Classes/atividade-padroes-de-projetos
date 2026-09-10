package estruturais.adapter.exemplo2.depois;

public class Cliente {

    public static void main(String[] args) {
        SensorTemperatura sensor = new SensorFahrenheitAdapter();
        System.out.println("Temperatura: " + sensor.getTemperaturaCelsius() + "°C");
    }
}
