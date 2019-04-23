package factory_method;

public class Client {
    public static void main(String[] args) {
        VehiclePlant carPlant = new CarPlant();
        VehiclePlant locomotivePlant = new LocomotivePlant();
        Vehicle car = carPlant.createVehicle();
        Vehicle loco = locomotivePlant.createVehicle();
    }
}
