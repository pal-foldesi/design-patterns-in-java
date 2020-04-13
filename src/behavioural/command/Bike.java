package behavioural.command;

public class Bike {
    private Oiledness oiledness;
    private double tirePressure;

    public Oiledness getOiledness() {
        return oiledness;
    }

    public void setOiledness(Oiledness oiledness) {
        this.oiledness = oiledness;
    }

    public double getTirePressure() {
        return tirePressure;
    }

    public void setTirePressure(double tirePressure) {
        this.tirePressure = tirePressure;
    }
}