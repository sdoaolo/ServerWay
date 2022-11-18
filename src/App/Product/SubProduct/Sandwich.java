package App.Product.SubProduct;

import App.Ingredient.MAIN_INGREDIENT;
import App.Ingredient.SubIngredient.Bread;
import App.Ingredient.SubIngredient.Cheese;
import App.Ingredient.SubIngredient.Sauce;
import App.Ingredient.SubIngredient.Vegetable;
import App.Product.Product;

public class Sandwich extends Product {
    MAIN_INGREDIENT mainIngredient;
    Bread bread;
    Cheese[] cheese;
    Vegetable[] vegetable;
    Sauce[] sauce;

    public Sandwich(int id, String name, int calorie, int price, MAIN_INGREDIENT mainIngredient, Bread bread, Cheese[] cheese, Vegetable[] vegetable, Sauce[] sauce) {
        super(id, name, calorie, price);
        this.mainIngredient = mainIngredient;
        this.bread = bread;
        this.cheese = cheese;
        this.vegetable = vegetable;
        this.sauce = sauce;
    }
}
