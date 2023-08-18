package dough;

public class Thin implements IDough{
    
    private final String name = "Thin";
    private final Integer price = 5300;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Integer priceDough() {
        return price;
    }

}
