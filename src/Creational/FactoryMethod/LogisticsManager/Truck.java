package Creational.FactoryMethod.LogisticsManager;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Distribute by road \nTransport Vehicle : Truck");
    }
}
