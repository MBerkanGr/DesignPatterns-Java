package Creational.FactoryMethod.LogisticsManager;

public class Test {
    public static void main(String[] args) {
        Logistics roadLogistic = new RoadLogistic();
        Transport transport = roadLogistic.createTransport();
        transport.deliver();
    }
}
