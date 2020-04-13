package behavioural.command;

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
        double tirePressure = bike.getTirePressure();
        if (tirePressure <= 4.0) {
            bike.setTirePressure(tirePressure + 0.2);
        }
    }
}
