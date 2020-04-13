package org.palfoldesi.behavioural.command;

public class PumpCommand implements Command {
    private Bike bike;

    public PumpCommand(Bike bike) {
        if (bike == null) {
            throw new IllegalArgumentException("Bike cannot be null!");
        }
        this.bike = bike;
    }

    @Override
    public void execute() {
        double tirePressure = bike.getTirePressureInPsi();
        if (tirePressure < 60) {
            bike.setTirePressureInPsi(bike.getTirePressureInPsi() + 5);
        }
    }
}
