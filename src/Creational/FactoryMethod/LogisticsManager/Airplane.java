package Creational.FactoryMethod.LogisticsManager;

public class Airplane implements Transport {
    @Override
    public void deliver() {
        System.out.println("Distribute by air \nTransport Vehicle : Airplane");
    }
}
