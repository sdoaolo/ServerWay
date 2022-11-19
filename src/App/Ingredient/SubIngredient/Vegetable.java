package App.Ingredient.SubIngredient;

import App.Ingredient.Ingredient;

public class Vegetable extends Ingredient {
    private String icon = "🥬";
    public Vegetable(int kcal, String name) {
        super(kcal, name);
    }
    public String getIcon() { return icon; }
}
