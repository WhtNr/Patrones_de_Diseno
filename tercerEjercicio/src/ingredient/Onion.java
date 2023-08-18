package ingredient;

public class Onion implements IIngredient {
    
    String name = "Onion";
    Integer price = 1500;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Integer priceIngredient() {
        return price;
    }

}
