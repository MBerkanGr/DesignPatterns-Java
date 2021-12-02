package Creational.AbstractFactory.ShapeColorManager;

public class ColorFactory extends AbstractFactory{

    @Override
    Color getColor(String color) {
        if(color.equals("blue")){
            return new Blue();
        }
        else if(color.equals("green")){
            return new Green();
        }
        else if(color.equals("red")){
            return new Red();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
