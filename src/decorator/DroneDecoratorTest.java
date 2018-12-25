package decorator;

public class DroneDecoratorTest {
    public static void main(String[] args) {
        Aircraft aircraft = new BasicDrone();
        aircraft = new StealthDrone(aircraft);
        aircraft = new CargoDrone(aircraft);
        aircraft.fly();
    }
}
