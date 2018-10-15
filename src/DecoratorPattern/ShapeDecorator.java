package DecoratorPattern;

public abstract class ShapeDecorator implements Shape {

    protected Shape DecoratorShape;

    public ShapeDecorator(Shape shape) {
        this.DecoratorShape = shape;
    }


    public void draw() {
        this.DecoratorShape.draw();
    }
}
