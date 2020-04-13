package org.palfoldesi.structural.adapter;

public class KelvinAdapter implements TemperatureSensor {
    private CelsiusSensor celsiusSensor;

    public KelvinAdapter(CelsiusSensor sensor) {
        this.celsiusSensor = sensor;
    }

    public double getTemperature() {
        return this.celsiusSensor.getTemperature() + 273.15;
    }

    public String toString() {
        return getTemperature() + " degrees Kelvin";
    }
}
