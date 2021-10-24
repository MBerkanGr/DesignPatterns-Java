package BasicPrinciples.ISP;

public class Bird implements Animal{
    @Override
    public void walk() {
        System.out.println("Bird is walking");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void bark() {
        // Do nothing
    }
}
