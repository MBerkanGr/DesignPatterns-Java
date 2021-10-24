package BasicPrinciples.ISP;

public class Dog implements Walkable,Barkable{
    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }

    /*
    @Override
    public void fly() {
        // Do nothing
    }
    */

    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }
}
