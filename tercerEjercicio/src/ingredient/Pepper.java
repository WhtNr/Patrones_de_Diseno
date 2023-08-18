package ingredient;

public class Pepper implements IIngredient {

    String name = "Pepper";
    Integer price = 2600;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Integer priceIngredient() {
        return price;
    }
    
}
