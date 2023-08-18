package ingredient;

public class Pineapple implements IIngredient {
    
    private final String name = "Pineapple";
    private final Integer price = 3800;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Integer priceIngredient() {
        return price;
    }

}
