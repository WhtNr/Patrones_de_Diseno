package ingredient;

public class Ham implements IIngredient{
    
    String name = "Ham";
    Integer price = 3400;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Integer priceIngredient() {
        return price;
    }

}
