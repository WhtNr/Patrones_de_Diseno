package size;

public class Big implements ISize{

    private final String name = "Big";
    private final Integer price = 15300;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Integer priceSize() {
        return price;
    }

}
