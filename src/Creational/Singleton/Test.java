package Creational.Singleton;

public class Test {
    public static void main(String[] args) {
	   Runnable run = () -> {
	       Singleton.getInstance();
	   };
	   
	   for(int i = 0 ; i < 10000 ; i++) {
	       Thread thread = new Thread(run);
	       thread.start();
	       Thread thread2 = new Thread(run);
	       thread2.start();
	   }
    }
}
