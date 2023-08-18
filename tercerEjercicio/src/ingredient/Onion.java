package ingredient;

public class Onion implements IIngredient {
    
    private final String name = "Onion";
    private final Integer price = 1500;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Integer priceIngredient() {
        return price;
    }

}
