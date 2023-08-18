package dough;

public class Thin implements IDough{
    
    String name = "Thin";
    Integer price = 5300;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Integer priceDough() {
        return price;
    }

}
