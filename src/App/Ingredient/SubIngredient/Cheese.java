package App.Ingredient.SubIngredient;

import App.Ingredient.Ingredient;

public class Cheese extends Ingredient {
    private String icon = "🧀";
    public Cheese(int kcal, String name) {
        super(kcal, name);
    }
    public String getIcon() { return icon; }
}
