package App.Product;

public class Product {
    int calorie;
    int id;
    String name;
    int price;

    public Product(int calorie, int id, String name, int price) {
        this.calorie = calorie;
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
