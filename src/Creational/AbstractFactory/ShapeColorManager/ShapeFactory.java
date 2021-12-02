package Creational.AbstractFactory.ShapeColorManager;

public class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if(shape.equals("circle")){
            return new Circle();
        }
        else if(shape.equals("rectangle")){
            return new Rectangle();
        }
        else if(shape.equals("square")){
            return new Square();
        }
        return null;
    }
}
