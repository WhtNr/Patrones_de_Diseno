package ingredient;

public class Cheese implements IIngredient {

    private final String name = "Cheese";
    private final Integer price = 4300;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Integer priceIngredient() {
        return price;
    }

}
