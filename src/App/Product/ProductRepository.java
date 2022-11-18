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
import App.Product.SubProduct.Sandwich;
import App.Product.SubProduct.Side;
import App.Product.SubProduct.SubProductType.Drink;
import App.Product.SubProduct.SubProductType.WedgesAndSoup;

import java.util.Arrays;

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
    private Sandwich[] sandwiches ;
    private Side[] cookiesAndChips ;
    private Drink[] drinks;
    private Side[] wedgeAndSoups ;

    public ProductRepository(Product[] products) {
        this.products = products;
        this.sandwiches = (Sandwich[]) Arrays.copyOfRange(products,0,4);
        this.cookiesAndChips = (Side[]) Arrays.copyOfRange(products,4,10);
        this.drinks = (Drink[]) Arrays.copyOfRange(products,10,13);
        this.wedgeAndSoups = (WedgesAndSoup[]) Arrays.copyOfRange(products,13,17);
    }

    public Product[] getProducts() {
        return products;
    }

    public Sandwich[] getSandwiches() {
        return sandwiches;
    }

    public Side[] getCookiesAndChips() {
        return cookiesAndChips;
    }

    public Drink[] getDrinks() {
        return drinks;
    }

    public Side[] getWedgeAndSoups() {
        return wedgeAndSoups;
    }
}
