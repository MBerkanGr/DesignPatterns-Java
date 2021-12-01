package Creational.FactoryMethod.LogisticsManager;

public class SeaLogistic implements Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
