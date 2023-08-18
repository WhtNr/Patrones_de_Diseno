package ingredient;

public class Olive implements IIngredient{
    
    String name = "Olive";
    Integer price = 1700;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Integer priceIngredient() {
        return price;
    }

}
