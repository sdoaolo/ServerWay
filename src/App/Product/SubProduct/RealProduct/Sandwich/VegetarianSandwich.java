package App.Product.SubProduct.RealProduct.Sandwich;


import App.Ingredient.MAIN_INGREDIENT;
import App.Ingredient.SubIngredient.Bread;
import App.Ingredient.SubIngredient.Cheese;
import App.Ingredient.SubIngredient.Sauce;
import App.Ingredient.SubIngredient.Vegetable;
import App.MenuProduct;
import App.Product.SubProduct.Sandwich;

public class VegetarianSandwich extends Sandwich {
    public VegetarianSandwich(MAIN_INGREDIENT mainIngredient, Bread bread, Cheese[] cheese, Vegetable[] vegetable, Sauce[] sauce) {
        super(MenuProduct.VEGETARIAN_SANDWICH.getId(),
                MenuProduct.VEGETARIAN_SANDWICH.getName(),
                MenuProduct.VEGETARIAN_SANDWICH.getCalorie(),
                MenuProduct.VEGETARIAN_SANDWICH.getPrice(),
                mainIngredient, bread, cheese, vegetable, sauce);
    }


}
