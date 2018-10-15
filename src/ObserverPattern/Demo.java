package ObserverPattern;

public class Demo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);

        subject.setState(15);
        subject.setState(10);
    }
}
