package App.Ingredient.SubIngredient;

import App.Ingredient.Ingredient;

public class Bread extends Ingredient {
    private String icon = "🥖";
    Boolean burn;
    int length;

    public Bread(int kcal, String name) {
        super(kcal, name);
    }
    public Bread(int kcal, String name, int length, Boolean burn) {
        super(kcal, name);
        this.length = length;
        this.burn = burn;
    }

    public Bread() {
        super();
    }

    public String getIcon() { return icon; }

    public Boolean getBurn() {
        return burn;
    }

    public int getLength() {
        return length;
    }


}
