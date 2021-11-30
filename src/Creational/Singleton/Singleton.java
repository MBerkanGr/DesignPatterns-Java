package Creational.Singleton;

public class Singleton {

    private static Singleton instance;
    private static int n = 0;

    private Singleton(){}

    public static Singleton getInstance(){

        if(instance == null){
            n++;
            instance = new Singleton();
        }
        return instance;
    }

    public static int getN(){
        return n;
    }
}
