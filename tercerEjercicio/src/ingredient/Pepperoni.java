package ingredient;

public class Pepperoni implements IIngredient{

    private final String name = "Pepperoni";
    private final Integer price = 3200;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Integer priceIngredient() {
        return price;
    }
    
}
