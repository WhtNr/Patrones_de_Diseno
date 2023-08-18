package size;

public class Big implements ISize{

    String name = "Big";
    Integer price = 15300;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Integer priceSize() {
        return price;
    }

}
