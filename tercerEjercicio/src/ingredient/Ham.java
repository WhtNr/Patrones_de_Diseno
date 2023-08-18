package ingredient;

public class Ham implements IIngredient{
    
    private final String name = "Ham";
    private final Integer price = 3400;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Integer priceIngredient() {
        return price;
    }

}
