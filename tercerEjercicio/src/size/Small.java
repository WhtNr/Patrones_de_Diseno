package size;

public class Small implements ISize{
    
    private final String name = "Small";
    private final Integer price = 10000;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Integer priceSize() {
        return price;
    }

}
