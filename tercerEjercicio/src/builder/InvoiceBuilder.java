package builder;

import ingredient.IIngredient;
import dough.IDough;
import size.ISize;
import product.Invoice;

import java.util.HashMap;

public class InvoiceBuilder implements IDirector{
    
    private HashMap<IIngredient, Integer> ingredientP;
    private Integer sizeP;
    private Integer doughP;
    private Integer extracheeseP;   
    
    @Override
    public void Dough(IDough dough){
        this.doughP = dough.priceDough();
    }

    @Override
    public void Size(ISize size){
        this.sizeP = size.priceSize();
    } 

    @Override
    public void Ingredients(HashMap<IIngredient, Integer> map){
        this.ingredientP = map;
    }

    @Override
    public void ExtraCheese(boolean extracheese){
        if (extracheese == true){
            this.extracheeseP = 4500;
        } else {
            this.extracheeseP = 0;
        }
    }


    public Invoice getInvoice(){
        return new Invoice(sizeP, doughP, ingredientP, extracheeseP);
    }

}
