package App.Product.SubProduct;

import App.Product.Product;
import App.Product.SubProduct.SubProductType.Drink;

public class Set extends Product {
    //Sandwich, Side(Cookie/Chip), Drink
    Sandwich sandwich;
    //Side side; //Cookie or Chip으로 한정 시켜야함.
    Side cookie_or_chip;
    Drink drink;

    public Set(int id, String name,int calorie, int price, Sandwich sandwich, Side cookie_or_chip, Drink drink) {
        super(id, name, calorie, price);
        this.sandwich = sandwich;
        this.cookie_or_chip = cookie_or_chip;
        this.drink = drink;
    }
}
