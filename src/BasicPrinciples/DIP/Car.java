package BasicPrinciples.DIP;

public class Car {
    public class Audi {
        public void run(){
            System.out.println("Audi is running");
        }
        public void stop(){
            System.out.println("Audi is stopping");
        }
    }

    public class Mercedes {
        public void run(){
            System.out.println("Mercedes is running");
        }
        public void stop(){
            System.out.println("Mercedes is stopping");
        }
    }

    public class AutomobileService {
        public void run(){
            Audi audi = new Audi();
            audi.run();
            Mercedes mercedes = new Mercedes();
            mercedes.run();
        }

        public void stop(){
            Audi audi = new Audi();
            audi.run();
            Mercedes mercedes = new Mercedes();
            mercedes.run();
        }
    }
}

