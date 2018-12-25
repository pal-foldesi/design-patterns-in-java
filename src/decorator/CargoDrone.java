package decorator;

public class CargoDrone extends DroneDecorator {
    public CargoDrone(Aircraft aircraft) {
        super(aircraft);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Flying faster for quick delivery...");
    }
}
