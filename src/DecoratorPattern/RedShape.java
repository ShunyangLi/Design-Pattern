package DecoratorPattern;

public class RedShape extends ShapeDecorator {

    public RedShape(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        this.DecoratorShape.draw();
        setRedBorder(this.DecoratorShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
