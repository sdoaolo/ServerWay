package App.Product.SubProduct;

import App.Ingredient.MAIN_INGREDIENT;
import App.Ingredient.SubIngredient.Bread;
import App.Ingredient.SubIngredient.Cheese;
import App.Ingredient.SubIngredient.Sauce;
import App.Ingredient.SubIngredient.Vegetable;
import App.Product.Product;

public class Sandwich extends Product {
    protected String icon = "🥪";
    private MAIN_INGREDIENT mainIngredient;
    private Bread bread;
    private Cheese[] cheese;
    private Vegetable[] vegetable;
    private Sauce[] sauce;

    public Sandwich(int productId, int id, String name, int calorie, int price, MAIN_INGREDIENT mainIngredient, Bread bread, Cheese[] cheese, Vegetable[] vegetable, Sauce[] sauce) {
        super(productId,id, name, calorie, price);
        this.mainIngredient = mainIngredient;
        this.bread = bread;
        this.cheese = cheese;
        this.vegetable = vegetable;
        this.sauce = sauce;
    }

    public String getIcon() { return icon; }

}
