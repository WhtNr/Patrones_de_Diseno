package ingredient;

public class Pineapple implements IIngredient {
    
    String name = "Pineapple";
    Integer price = 3800;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Integer priceIngredient() {
        return price;
    }

}
