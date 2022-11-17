package App.Product.SubProduct;

import App.Ingredient.MainIngredient;
import App.Ingredient.SubIngredient.Bread;
import App.Ingredient.SubIngredient.Cheese;
import App.Ingredient.SubIngredient.Sauce;
import App.Ingredient.SubIngredient.Vegetable;
import App.Product.Product;

public class Sandwich extends Product {
    MainIngredient mainIngredient;
    Bread bread;
    Cheese[] cheese;
    Vegetable[] vegetable;
    Sauce[] sauce;

    public Sandwich(int calorie, int id, String name, int price) {
        super(calorie, id, name, price);
        //일단 나머지는 생성 x
    }
}
