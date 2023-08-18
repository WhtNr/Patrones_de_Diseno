package dough;

public class Integral implements IDough{
    
    private final String name = "Integral";
    private final Integer price = 6000;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Integer priceDough() {
        return price;
    }

}
