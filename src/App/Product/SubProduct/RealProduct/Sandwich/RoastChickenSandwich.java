package App.Product.SubProduct.RealProduct.Sandwich;

import App.Ingredient.MAIN_INGREDIENT;
import App.Ingredient.SubIngredient.Bread;
import App.Ingredient.SubIngredient.Cheese;
import App.Ingredient.SubIngredient.Sauce;
import App.Ingredient.SubIngredient.Vegetable;
import App.MenuProduct;
import App.Product.SubProduct.Sandwich;

public class RoastChickenSandwich extends Sandwich {
    public RoastChickenSandwich(MAIN_INGREDIENT mainIngredient, Bread bread, Cheese[] cheese, Vegetable[] vegetable, Sauce[] sauce) {
        super(
                MenuProduct.ROAST_CHIKEN_SANWICH.getProductId(),
                MenuProduct.ROAST_CHIKEN_SANWICH.getId(),
                MenuProduct.ROAST_CHIKEN_SANWICH.getName(),
                MenuProduct.ROAST_CHIKEN_SANWICH.getCalorie(),
                MenuProduct.ROAST_CHIKEN_SANWICH.getPrice(),
                mainIngredient, bread, cheese, vegetable, sauce);
    }
    @Override
    public String getIcon() { return "🍗"; }
}
