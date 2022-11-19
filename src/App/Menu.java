package App;

import App.Product.Product;
import App.Product.SubProduct.Combo;
import App.Product.SubProduct.Sandwich;
import App.Product.SubProduct.Set;
import App.Product.SubProduct.Side;
import App.Product.SubProduct.SubProductType.Chip;
import App.Product.SubProduct.SubProductType.Cookie;
import App.Product.SubProduct.SubProductType.Drink;
import App.Product.SubProduct.SubProductType.WedgesAndSoup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {
    private Product[] products;

    //메뉴를 위한 리스트
    private List<Sandwich> sandwiches = new ArrayList<>();
    private List<Side> cookiesAndChips = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();
    private List<WedgesAndSoup> wedgeAndSoups = new ArrayList<>();

    private Set set;
    private Combo combo;

    public Menu(Product[] products){
        this.products = products;

        for (Product product : products){
            if (product instanceof Sandwich){
                sandwiches.add((Sandwich) product);
            }
            else if (product instanceof Cookie || product instanceof Chip){
                cookiesAndChips.add((Side) product);
            }
            else if (product instanceof Drink){
                drinks.add((Drink) product);
            }
            else if (product instanceof WedgesAndSoup){
                wedgeAndSoups.add((WedgesAndSoup) product);
            }
        }
    }
    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public List<Side> getCookiesAndChips() {
        return cookiesAndChips;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public List<WedgesAndSoup> getWedgeAndSoups() {
        return wedgeAndSoups;
    }

    public void printOrderSandwich() {

        System.out.println("[📣] 샌드위치 주문하기 __ 🥪");
        System.out.println("☑️ 샌드위치 제품을 선택해주세요 : ");
        System.out.println("-".repeat(60));

        for (Sandwich sandwich : sandwiches){
            System.out.printf("[%d. %s %s] %5d원 \n",
                    sandwich.getId(), sandwich.getIcon(), sandwich.getName(),sandwich.getPrice());
        }
        //int num = Integer.parseInt(scanner.nextLine());

        /*
        System.out.println("[1. 🍗 로스트 치킨 샌드위치]");
        System.out.println("[2. 🥚 에그마요 샌드위치]");
        System.out.println("[3. 🥓 이탈리안 BMT 샌드위치]");
        System.out.println("[4. 🥬 베지테리안 전용 샌드위치]");
        */
        System.out.println("-".repeat(60));
    }

    public void printBreadOption(){

        System.out.println("☑️ 빵을 선택해주세요 __ 🥖");
        System.out.println();
        System.out.println("길이: ");
        System.out.println("[1. 15cm] [2. 30cm]");
        //int selectSide = Integer.parseInt(scanner.nextLine());

        System.out.println();
        System.out.println("굽기 : ");
        System.out.println("[1. 굽기] [2. 굽기선택안함]");

        System.out.println();
        System.out.println("종류: ");
        System.out.println("[1. 화이트] [2. 위트] [3. 허니오트]");

        System.out.println("-".repeat(60));


    }

    public void printCheeseOption() {
        System.out.println("☑️ 치즈를 선택해주세요 __ 🧀");
        System.out.println();
        System.out.println("종류: ");
        System.out.println("[1. 아메리칸] [2. 모차렐라] [3. 치즈 제외]");
        //int selectSide = Integer.parseInt(scanner.nextLine());

        System.out.println();
        System.out.println("치즈를 추가하시겠습니까? :");
        System.out.println("[1. 아메리칸] [2. 모차렐라] [3. 추가안함]");

        System.out.println("-".repeat(60));
    }

    public void printVegetableOption() {
        System.out.println("☑️ 제외할 야채를 선택해주세요 __ 🥬 (최대 6개)");
        System.out.println();
        System.out.println("종류: ");
        System.out.println("[1. 제외할 야채 없음] [2. 양상추] [3. 토마토]\n" +
                "[4. 오이] [5. 피클] [6. 올리브] [7. 할라피뇨]");
        //int selectSide = Integer.parseInt(scanner.nextLine());

        System.out.println();
        System.out.println("[0. 선택완료]");

        System.out.println("-".repeat(60));
    }
    public void printSauceOption() {
        System.out.println("☑️ 소스를 선택해주세요 __🥫 (최대 3개)");
        System.out.println();
        System.out.println("종류: ");
        System.out.println("[1. 머스타드] [2. 스위트 어니언] [3. 스모크 바베큐]\n" +
                "[4. 렌치] [5. 올리브오일] [6. 선택안함]");
        //int selectSide = Integer.parseInt(scanner.nextLine());

        System.out.println();
        System.out.println("[0. 선택완료]");

        System.out.println("-".repeat(60));
    }


    public void printOtherIngredientOption() {
        System.out.println("☑️ 추가할 재료를 선택해주세요 __🥑 (최대 5개)");
        System.out.println();
        System.out.println("종류: ");
        System.out.println("[1. 에그마요] [2. 페퍼로니] [3. 베이컨]\n" +
                "[4. 아보카도] [5. 오믈렛] [6. 선택 안함]");
        //int selectSide = Integer.parseInt(scanner.nextLine());

        System.out.println();
        System.out.println("[0. 선택완료]");

        System.out.println("-".repeat(60));
    }


    public void printOrderSide(){

        System.out.println("[📣] 사이드 주문하기 __ 🍪🍟🥤");
        System.out.println("☑️ 사이드를 선택해주세요 : ");
        System.out.println();

        System.out.println("[1. 쿠키] [2. 칩] [3. 웨지 또는 스프] [4. 음료]");
        System.out.println("-".repeat(60));

        //int selectSide = Integer.parseInt(scanner.nextLine());
        /*
        switch (selectSide){

        }
        */
    }
    public void printCookieOption() {
        System.out.println("☑️ 쿠키를 선택해주세요 : ");
        System.out.println();
        System.out.println("[1. 라즈베리치즈쿠키] [2. 더블초코칩쿠키] [3. 초코칩쿠키]");
        //int selectSide = Integer.parseInt(scanner.nextLine());
        System.out.println();
        System.out.println("-".repeat(60));
    }
    public void printChipsOption() {
        System.out.println("☑️ 칩을 선택해주세요 : ");
        System.out.println();
        System.out.println("[1. 포카칩] [2. 포테이토칩] [3. 스윙칩]");
        //int selectSide = Integer.parseInt(scanner.nextLine());
        System.out.println();
        System.out.println("-".repeat(60));
    }

    public void printWedgeAndSoupOption() {
        System.out.println("☑️ 웨지 또는 스프를 선택해주세요 :");
        System.out.println();
        System.out.println("[1. 웨지포테이토] [2. 해쉬브라운]\n" +
                "[3. 브로콜리체다스프] [4.양송이스프]");
        //int selectSide = Integer.parseInt(scanner.nextLine());
        System.out.println();
        System.out.println("-".repeat(60));
    }
    public void printDrinkOption() {
        System.out.println("☑️ 음료를 선택해주세요 :");
        System.out.println();
        System.out.println("[1. 콜라] [2. 제로콜라] [3. 사이다] [4.아메리카노]");
        //int selectSide = Integer.parseInt(scanner.nextLine());
        System.out.println();
        System.out.println("-".repeat(60));
    }

    public void printOrderSet() {
        System.out.println("[📣] 세트 주문하기 __ 🥪🍪🥤");
        //
        printOrderSandwich();

        //쿠키/칩 선택 입력 받기
        printCookieOption();
        printChipsOption();

        //음료 선택 입력
        printDrinkOption();

    }
    public void printOrderCombo() {
        System.out.println("[📣] 콤보 주문하기 __ 🥪🥤");
        //샌드위치 선택
        printOrderSandwich();

        //음료 선택 입력
        printDrinkOption();

    }


}

