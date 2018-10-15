package FactoryPattern;

public class FactoryDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

//        Shape rectangle = shapeFactory.getShape("RECTANGLE");
//        rectangle.draw();


        System.out.println("This is another method which is using class to get correct shape!!");

        FactoryWithClass factory = new FactoryWithClass();
        Shape rectangle = factory.getClass(Rectangle.class);
        rectangle.draw();

        Shape c1 = factory.getClass(Circle.class);
        c1.draw();
    }
}
