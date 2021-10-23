package BasicPrinciples.LSP;

public class WiredHeadphone implements Headphone{

    @Override
    public void volumeUp() {
        System.out.println("Volume ++");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume --");
    }

    @Override
    public String openBluetooth() {
        return null;
    }
}
