package Creational.FactoryMethod.LogisticsManager;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Distribute by Sea \nTransport Vehicle : Ship");
    }
}
