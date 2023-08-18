package dough;

public class Integral implements IDough{
    
    String name = "Integral";
    Integer price = 6000;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Integer priceDough() {
        return price;
    }

}
