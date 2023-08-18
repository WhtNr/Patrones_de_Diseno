package size;

public class Small implements ISize{
    
    String name = "Small";
    Integer price = 10000;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Integer priceSize() {
        return price;
    }

}
