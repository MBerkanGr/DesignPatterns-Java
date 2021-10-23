package BasicPrinciples.LSP;

public class WirelessHeadphones implements Headphone_2 , Bluetooth {
    @Override
    public void volumeUp(){
        System.out.println("Volume ++");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume --");
    }

    @Override
    public String openBluetooth() {
        return "Bluetooth connected";
    }
}
