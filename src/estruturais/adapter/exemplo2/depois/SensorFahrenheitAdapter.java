package estruturais.adapter.exemplo2.depois;

// Adapter por herança: estende a classe legada e implementa a interface
// que o resto do sistema espera.
public class SensorFahrenheitAdapter extends SensorFahrenheit implements SensorTemperatura {

    @Override
    public double getTemperaturaCelsius() {
        double fahrenheit = getTemperaturaFahrenheit(); // método herdado
        return (fahrenheit - 32) * 5 / 9;
    }
}
