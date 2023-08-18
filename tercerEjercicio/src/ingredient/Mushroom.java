package ingredient;

public class Mushroom implements IIngredient{
    
    String name = "Mushroom";
    Integer price = 2700;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Integer priceIngredient() {
        return price;
    }

}
