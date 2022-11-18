package App.Ingredient;

public class Ingredient {
    int kcal;
    String name;

    public Ingredient(int kcal, String name) {
        this.kcal = kcal;
        this.name = name;
    }

    public Ingredient() {

    }

    public int getKcal() {
        return kcal;
    }
    public String getName() {
        return name;
    }

}
