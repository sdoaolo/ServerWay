package App.Product;

public class Product {
    int productId;
    int id;
    String name;
    int calorie;
    int price;

    public Product(int productId, int id, String name, int calorie, int price) {
        this.productId = productId;
        this.id = id;
        this.name = name;
        this.calorie = calorie;
        this.price = price;
    }

    public int getProductId() {
        return productId;
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

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
