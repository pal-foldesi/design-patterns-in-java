package org.palfoldesi.behavioural.command;

public class Bike {
    private Oiledness oiledness;
    private int tirePressureInPsi;

    public Bike(Oiledness oiledness, int tirePressureInPsi) {
        this.oiledness = oiledness;
        this.tirePressureInPsi = tirePressureInPsi;
    }

    public Bike(Oiledness oiledness) {
        this.oiledness = oiledness;
    }

    public Bike(int tirePressureInPsi) {
        this.tirePressureInPsi = tirePressureInPsi;
    }

    public Oiledness getOiledness() {
        return oiledness;
    }

    public void setOiledness(Oiledness oiledness) {
        this.oiledness = oiledness;
    }

    public int getTirePressureInPsi() {
        return tirePressureInPsi;
    }

    public void setTirePressureInPsi(int tirePressureInPsi) {
        this.tirePressureInPsi = tirePressureInPsi;
    }
}