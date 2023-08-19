package product;

import ingredient.IIngredient;

import java.util.HashMap;
import java.util.Map;

public class Pizza {
    
    private final HashMap<IIngredient, Integer> ingredient;
    private final String size;
    private final String dough;
    private final boolean extracheese;


    public Pizza (String size, String dough, HashMap<IIngredient, Integer> ingredient, boolean extracheese){
        this.size = size;
        this.dough = dough;
        this.extracheese = extracheese;
        this.ingredient = ingredient;
    }

    public String chainingredient (){
        String chain = "";
        for (Map.Entry<IIngredient, Integer> walkin : ingredient.entrySet()){
            chain += "* " + walkin.getKey() + "  \tAmount: " + walkin.getValue() + "\n";
        }
        return chain; 
    }

    @Override
    public String toString(){
        return "Pizza\n\n" + "Size\t" + size + "\nDough\t" + dough + "\nIngredients\n" + chainingredient() + "\nExtracheese\t" + extracheese;
    }
}
