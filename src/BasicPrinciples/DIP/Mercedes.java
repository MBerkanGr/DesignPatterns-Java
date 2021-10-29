package BasicPrinciples.DIP;

public class Mercedes implements CarInterface{
    @Override
    public void run() {
        System.out.println("Mercedes is running");
    }

    @Override
    public void stop() {
        System.out.println("Mercedes is stopping");
    }
}
