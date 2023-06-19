package Creational.Singleton;

public class Singleton {
    private static Singleton instance;
    private static int n = 0;
    private static int m = 0;

    private Singleton(){
        System.out.println(n);
    }

    public static Singleton getInstance(){
        m++;
        if(instance == null) {
            synchronized (Singleton.class){
                if(instance == null){
                    n++;
                    instance = new Singleton();
                }
            }
        }
        System.out.println(m);
        return instance;
    }

    public static int getN(){
        return n;
    }
}
