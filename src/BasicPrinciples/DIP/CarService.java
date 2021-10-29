package BasicPrinciples.DIP;

public class CarService {
    private CarInterface carInterface;

    public CarService(CarInterface carInterface){
        this.carInterface = carInterface;
    }

    public void run(){
        carInterface.run();
    }

    public void stop(){
        carInterface.stop();
    }
}
