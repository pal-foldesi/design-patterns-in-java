package structural.bridge;

public class Client {
    public static void main(String[] args) {
        Vehicle helicopter = new Helicopter(new TurbineEngine());
        helicopter.move();

        Vehicle car = new Car(new ReciprocatingEngine());
        car.move();
    }
}
