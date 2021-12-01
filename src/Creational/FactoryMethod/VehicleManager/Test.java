package Creational.FactoryMethod.VehicleManager;

public class Test {
    public static void main(String[] args) {
        VehicleFactoryService vehicleFactory = new VehicleFactory();
        Vehicle vehicle = vehicleFactory.produceVehicle(VehicleType.CAR);
        vehicle.DisplayInfo();
    }
}
