package Creational.FactoryMethod.VehicleManager;

public class VehicleFactory implements VehicleFactoryService {
    @Override
    public Vehicle produceVehicle(VehicleType vehicleType) {
        Vehicle vehicle = null;
        switch (vehicleType){
            case CAR:
                vehicle = new Car();
                break;
            case TRUCK:
                vehicle = new Truck();
                break;
            case MOTORCYCLE:
                vehicle = new Motorcycle();
                break;
        }
        return vehicle;
    }
}
