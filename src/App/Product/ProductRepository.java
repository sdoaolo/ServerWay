package App.Product;

import App.Ingredient.MAIN_INGREDIENT;
import App.Ingredient.SubIngredient.Bread;
import App.Ingredient.SubIngredient.Cheese;
import App.Ingredient.SubIngredient.Sauce;
import App.Ingredient.SubIngredient.Vegetable;
import App.Product.SubProduct.RealProduct.Chips.PocaChips;
import App.Product.SubProduct.RealProduct.Chips.PotatoChips;
import App.Product.SubProduct.RealProduct.Chips.SwingChips;
import App.Product.SubProduct.RealProduct.Cookie.ChocoChipCookie;
import App.Product.SubProduct.RealProduct.Cookie.DoubleChocoChipCookie;
import App.Product.SubProduct.RealProduct.Cookie.RasberryCheeseCookie;
import App.Product.SubProduct.RealProduct.Drink.Americano;
import App.Product.SubProduct.RealProduct.Drink.Coke;
import App.Product.SubProduct.RealProduct.Drink.CokeZero;
import App.Product.SubProduct.RealProduct.Drink.Sprite;
import App.Product.SubProduct.RealProduct.Sandwich.EggMayoSandwich;
import App.Product.SubProduct.RealProduct.Sandwich.ItallianBMTSandwich;
import App.Product.SubProduct.RealProduct.Sandwich.RoastChickenSandwich;
import App.Product.SubProduct.RealProduct.Sandwich.VegetarianSandwich;
import App.Product.SubProduct.RealProduct.WedgeAndSoup.BroccoliSoup;
import App.Product.SubProduct.RealProduct.WedgeAndSoup.Hashbrown;
import App.Product.SubProduct.RealProduct.WedgeAndSoup.MushroomSoup;
import App.Product.SubProduct.RealProduct.WedgeAndSoup.Wedgepotato;


public class ProductRepository {

    private Product[] products ={
            new RoastChickenSandwich(MAIN_INGREDIENT.CHIKEN,new Bread(),new Cheese[]{},new Vegetable[]{}, new Sauce[]{}),
            new EggMayoSandwich(MAIN_INGREDIENT.EGGMAYO,new Bread(),new Cheese[]{},new Vegetable[]{}, new Sauce[]{}),
            new ItallianBMTSandwich(MAIN_INGREDIENT.PEPERONI,new Bread(),new Cheese[]{},new Vegetable[]{}, new Sauce[]{}),
            new VegetarianSandwich(MAIN_INGREDIENT.CORN,new Bread(),new Cheese[]{},new Vegetable[]{}, new Sauce[]{}),
            new RasberryCheeseCookie(),
            new DoubleChocoChipCookie(),
            new ChocoChipCookie(),
            new PocaChips(),
            new PotatoChips(),
            new SwingChips(),
            new Coke(),
            new CokeZero(),
            new Sprite(),
            new Americano(),
            new Wedgepotato(),
            new Hashbrown(),
            new BroccoliSoup(),
            new MushroomSoup()
    };

    public ProductRepository() {}

    public Product[] getProducts() {
        return products;
    }
}
