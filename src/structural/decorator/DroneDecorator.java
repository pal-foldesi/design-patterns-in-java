package structural.decorator;

public abstract class DroneDecorator implements Aircraft {
    private Aircraft aircraft;

    public DroneDecorator(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public void fly() {
        this.aircraft.fly();
    }
}
