package App.Product.SubProduct.RealProduct.Sandwich;

import App.Ingredient.MAIN_INGREDIENT;
import App.Ingredient.SubIngredient.Bread;
import App.Ingredient.SubIngredient.Cheese;
import App.Ingredient.SubIngredient.Sauce;
import App.Ingredient.SubIngredient.Vegetable;
import App.MenuProduct;
import App.Product.SubProduct.Sandwich;

public class ItallianBMTSandwich extends Sandwich {

    public ItallianBMTSandwich(MAIN_INGREDIENT mainIngredient, Bread bread, Cheese[] cheese, Vegetable[] vegetable, Sauce[] sauce) {
        super(MenuProduct.ITALLIAN_BMT_SANDWICH.getId(),
                MenuProduct.ITALLIAN_BMT_SANDWICH.getName(),
                MenuProduct.ITALLIAN_BMT_SANDWICH.getCalorie(),
                MenuProduct.ITALLIAN_BMT_SANDWICH.getPrice(),
                mainIngredient, bread, cheese, vegetable, sauce);
    }
}
