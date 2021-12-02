package Creational.AbstractFactory.ShapeColorManager;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if(choice.equals("color")){
            return  new ColorFactory();
        }
        else if(choice.equals("shape")){
            return new ShapeFactory();
        }
        return null;
    }
}
