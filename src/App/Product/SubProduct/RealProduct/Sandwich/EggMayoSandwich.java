package App.Product.SubProduct.RealProduct.Sandwich;

import App.Ingredient.MAIN_INGREDIENT;
import App.Ingredient.SubIngredient.Bread;
import App.Ingredient.SubIngredient.Cheese;
import App.Ingredient.SubIngredient.Sauce;
import App.Ingredient.SubIngredient.Vegetable;
import App.MenuProduct;
import App.Product.SubProduct.Sandwich;

public class EggMayoSandwich extends Sandwich  {


    public EggMayoSandwich(MAIN_INGREDIENT mainIngredient, Bread bread, Cheese[] cheese, Vegetable[] vegetable, Sauce[] sauce) {
        super(
                MenuProduct.EGGMAYO_SANWICH.getProductId(),
                MenuProduct.EGGMAYO_SANWICH.getId(),
                MenuProduct.EGGMAYO_SANWICH.getName(),
                MenuProduct.EGGMAYO_SANWICH.getCalorie(),
                MenuProduct.EGGMAYO_SANWICH.getPrice(),
                mainIngredient, bread, cheese, vegetable, sauce);
    }
    @Override
    public String getIcon() { return "🥚"; }
}
