package product;

import ingredient.IIngredient;

import java.util.HashMap;
import java.util.Map;

public class Invoice {
    
    private final HashMap<IIngredient, Integer> ingredient;
    private final Integer size;
    private final Integer dough;
    private final Integer extracheese;


    public Invoice (Integer size, Integer dough, HashMap<IIngredient, Integer> ingredient, Integer extracheese){
        this.size = size;
        this.dough = dough;
        this.extracheese = extracheese;
        this.ingredient = ingredient;
    }

    public Integer priceIngredient(){
        Integer total = 0;
        for (Map.Entry<IIngredient, Integer> walkin : ingredient.entrySet()){
            Integer price = 0;
            price = walkin.getKey().priceIngredient() * walkin.getValue();
            total += price;
        }
        return total;
    }

    public Integer totalprice(){
        return priceIngredient() + size + dough + extracheese;
    }

    public String chainingredient (){
        Integer price = 0;
        String chain = "";
        for (Map.Entry<IIngredient, Integer> walkin : ingredient.entrySet()){
            price = walkin.getKey().priceIngredient() * walkin.getValue();
            chain += "* " + walkin.getKey() + "(" + walkin.getValue() + ")\t" + price + " Cop\n";
        }
        return chain; 
    }

    public String toString(){
        return "\n\nInvoice\n" + "Price per Size (Cop)\t" + size + "\nPrice per Dough (Cop)\t" + dough + "\n\nPrice per Ingredients\n" + chainingredient() + "\nPrice per Extracheese (Cop)\t" + extracheese + "\n\nTotal Price (Cop) -------> " + totalprice();
    }
}
