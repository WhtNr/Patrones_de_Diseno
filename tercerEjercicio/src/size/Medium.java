package size;

public class Medium implements ISize{
    
    String name = "Medium";
    Integer price = 14000;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Integer priceSize() {
        return price;
    }

}
