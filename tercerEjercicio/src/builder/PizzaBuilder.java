package builder;

import ingredient.IIngredient;
import dough.IDough;
import size.ISize;
import product.Pizza;

import java.util.HashMap;

public class PizzaBuilder implements IDirector{
    
    private HashMap<IIngredient, Integer> ingredientF;
    private String sizeF;
    private String doughF;
    private boolean extracheeseF;

    @Override
    public void Dough(IDough dough){
        this.doughF = dough.toString();
    }

    @Override
    public void Size(ISize size){
        this.sizeF = size.toString();
    } 

    @Override
    public void Ingredients(HashMap<IIngredient, Integer> map){
        this.ingredientF = map;
    }

    @Override
    public void ExtraCheese(boolean extracheese){
        this.extracheeseF = extracheese;
    }


    public Pizza getPizza(){
        return new Pizza(sizeF, doughF, ingredientF, extracheeseF);
    }
}
