package builder;

import ingredient.IIngredient;
import dough.IDough;
import size.ISize;

import java.util.HashMap;

public interface IDirector {
    
    void Ingredients (HashMap<IIngredient, Integer> map);
    void Dough (IDough dough);
    void Size (ISize size);
    void ExtraCheese (boolean extracheese);

}
