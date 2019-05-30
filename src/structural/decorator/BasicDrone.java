package structural.decorator;

public class BasicDrone implements Aircraft {
    @Override
    public void fly() {
        System.out.println("Just simple flying...");
    }
}
