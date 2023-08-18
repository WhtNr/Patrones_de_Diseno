package dough;

public class Thick implements IDough{
    
    private final String name = "Thick";
    private final Integer price = 5500;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Integer priceDough() {
        return price;
    }

}
