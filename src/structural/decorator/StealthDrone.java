package structural.decorator;

public class StealthDrone extends DroneDecorator {

    public StealthDrone(Aircraft aircraft) {
        super(aircraft);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Flying with active sensors off, optics only");
    }
}
