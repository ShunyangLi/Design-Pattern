package DecoratorPattern;

public class Demo {

    public static void main(String[] args) {

        /**
         * @brief 其实就是在一个class的method里面，我想添加一个新的功能，但不是所有的都需要，所以这时候要用装饰模式
         * 就像Shape的class，里面的draw不能满足需求，我还想要一个颜色，所有就是装饰一下这个Shape是什么颜色的
         * 但是不是所有的都需要这个，所以是装饰
         */

        Shape circle = new Circle();
        circle.draw();

        System.out.println("This is circle with a red color!");
        Shape redCircle = new RedShape(new Circle());
        redCircle.draw();

        Shape rectangle = new Rectangle();
        rectangle.draw();

        System.out.println("This is circle with a red color!");
        Shape redRectangle = new RedShape(new Rectangle());
        redRectangle.draw();
    }

}
