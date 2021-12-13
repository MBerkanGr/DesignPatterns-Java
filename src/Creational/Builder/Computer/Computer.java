package Creational.Builder.Computer;

public class Computer {
    private String HDD;
    private String RAM;

    private Boolean isGraphicsCardEnabled;
    private Boolean isBluetoothEnabled;

    public Computer(ComputerBuilder computerBuilder) {
        this.HDD = computerBuilder.HDD;
        this.RAM = computerBuilder.RAM;
        this.isGraphicsCardEnabled = computerBuilder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
    }

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public Boolean getGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public Boolean getBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public static class ComputerBuilder {
        private String HDD;
        private String RAM;

        private Boolean isGraphicsCardEnabled;
        private Boolean isBluetoothEnabled;

        public ComputerBuilder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public String getHDD() {
            return HDD;
        }

        public String getRAM() {
            return RAM;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setIsBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
