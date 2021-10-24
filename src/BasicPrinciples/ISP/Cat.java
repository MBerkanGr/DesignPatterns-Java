package BasicPrinciples.ISP;

public class Cat implements Animal{
    @Override
    public void walk() {
        System.out.println("Cat is walking");
    }

    @Override
    public void fly() {
        // Do nothing
    }

    @Override
    public void bark() {
        // Do nothing
    }
}
