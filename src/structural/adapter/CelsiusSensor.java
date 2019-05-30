package structural.adapter;

public class CelsiusSensor implements TemperatureSensor {
    public double getTemperature() {
        return 38;
    }

    public String toString() {
        return getTemperature() + " degrees Centigrade";
    }
}
