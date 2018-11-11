package Builder;

public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "Cold Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
