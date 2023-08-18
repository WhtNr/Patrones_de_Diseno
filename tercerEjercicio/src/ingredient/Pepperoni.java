package ingredient;

public class Pepperoni implements IIngredient{

    String name = "Pepperoni";
    Integer price = 3200;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Integer priceIngredient() {
        return price;
    }
    
}
