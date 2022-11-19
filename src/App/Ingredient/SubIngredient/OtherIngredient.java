package App.Ingredient.SubIngredient;

import App.Ingredient.Ingredient;

public class OtherIngredient extends Ingredient {
    private String icon = "🥑";
    public OtherIngredient(int kcal, String name) {
        super(kcal, name);
    }
    public String getIcon() { return icon; }
}
