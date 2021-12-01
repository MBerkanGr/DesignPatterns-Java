package Creational.FactoryMethod.LogisticsManager;

public class AirLogistic implements Logistics {
    @Override
    public Transport createTransport() {
        return new Airplane();
    }
}
