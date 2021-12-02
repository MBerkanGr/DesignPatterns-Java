package Creational.AbstractFactory.ShapeColorManager;

public class Test {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape shape = shapeFactory.getShape("rectangle");

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color color = colorFactory.getColor("blue");

        System.out.println(color.fill() + " " + shape.draw());
    }
}
