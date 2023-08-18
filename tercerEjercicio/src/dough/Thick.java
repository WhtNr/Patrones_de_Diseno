package dough;

public class Thick implements IDough{
    
    String name = "Thick";
    Integer price = 5500;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Integer priceDough() {
        return price;
    }

}
