package App.Ingredient.SubIngredient;

import App.Ingredient.Ingredient;

public class Sauce extends Ingredient {
    private String icon = "🫙";
    public Sauce(int kcal, String name) {
        super(kcal, name);
    }
    public String getIcon() { return icon; }
}
