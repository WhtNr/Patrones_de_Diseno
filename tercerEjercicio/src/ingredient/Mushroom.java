package ingredient;

public class Mushroom implements IIngredient{
    
    private final String name = "Mushroom";
    private final Integer price = 2700;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Integer priceIngredient() {
        return price;
    }

}
