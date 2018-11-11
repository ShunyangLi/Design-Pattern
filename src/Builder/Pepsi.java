package Builder;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Cold Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
