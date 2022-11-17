package App.Ingredient;

public class Ingredient {
    int kcal;
    String name;

    public Ingredient(int kcal, String name) {
        this.kcal = kcal;
        this.name = name;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
