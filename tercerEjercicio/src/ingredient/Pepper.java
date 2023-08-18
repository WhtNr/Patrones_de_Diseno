package ingredient;

public class Pepper implements IIngredient {

    private final String name = "Pepper";
    private final Integer price = 2600;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Integer priceIngredient() {
        return price;
    }
    
}
