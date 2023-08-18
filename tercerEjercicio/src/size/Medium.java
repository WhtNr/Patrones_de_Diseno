package size;

public class Medium implements ISize{
    
    private final String name = "Medium";
    private final Integer price = 14000;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Integer priceSize() {
        return price;
    }

}
