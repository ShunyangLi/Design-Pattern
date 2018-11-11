package Builder;

public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chick burger!";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
