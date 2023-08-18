package ingredient;

public class Cheese implements IIngredient {

    String name = "Cheese";
    Integer price = 4300;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Integer priceIngredient() {
        return price;
    }

}
