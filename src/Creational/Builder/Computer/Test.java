package Creational.Builder.Computer;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder(
                "500GB", "16GB")
                .setGraphicsCardEnabled(true)
                .setIsBluetoothEnabled(true).build();
    }
}
