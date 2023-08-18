package ingredient;

public class Olive implements IIngredient{
    
    private final String name = "Olive";
    private final Integer price = 1700;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Integer priceIngredient() {
        return price;
    }

}
