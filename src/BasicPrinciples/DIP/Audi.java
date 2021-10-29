package BasicPrinciples.DIP;

public class Audi implements CarInterface{
    @Override
    public void run() {
        System.out.println("Audi is running");
    }

    @Override
    public void stop() {
        System.out.println("Audi is stopping");
    }
}
