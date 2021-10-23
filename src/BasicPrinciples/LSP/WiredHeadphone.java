package BasicPrinciples.LSP;

public class WiredHeadphone implements Headphone_2 {

    @Override
    public void volumeUp() {
        System.out.println("Volume ++");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume --");
    }

    /*
    @Override
    public String openBluetooth() {
        return null;
    }
    */
}
