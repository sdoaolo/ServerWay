package App;


public enum MenuProduct {
    ROAST_CHIKEN_SANWICH(1,"로스트 치킨 샌드위치", 640, 5000),
    EGGMAYO_SANWICH(2, "에그마요 샌드위치", 620, 6000),
    ITALLIAN_BMT_SANDWICH(3,"이탈리안 BMT 샌드위치",560, 6200),
    VEGETARIAN_SANDWICH(4, "베지터리안 샌드위치", 430,5500),

    RASBERRY_CHEESE_COOKIE(5, "라즈베리치즈쿠키", 240,1600),
    DOUBLE_CHOCO_CHIP_COOKIE(6,"더블초코칩쿠키",300,1600),
    CHOCOCHIP_COOKIE(7,"초코칩쿠키", 270,1600),

    POCACHIPS(8,"포카칩",250, 1400),
    POTATOCHIPS(9,"포테이토칩",240, 1400),
    SWINGCHIPS(10,"스윙칩",220,1400),

    WEDGEPOTATOE(11,"웨지포테이토", 360,3200),
    HASHBROWN(12,"해쉬브라운",340,2700 ),
    BROCOLI_SOUP(13,"브로콜리체다스프",420,4200),
    MUSHROOM_SOUP(14,"양송이스프",410,3900),

    COKE(15,"코카콜라", 180,1500),
    COKE_ZERO(16,"제로콜라",0,1500 ),
    SPRITE(17,"스프라이트",170,1500),
    AMERICANO(18,"아메리카노",10,3500);

    private final int id;
    private final String name;
    private final int calorie;
    private final int price;

    MenuProduct(int id,String name, int calorie, int price){
        this.id = id;
        this.name = name;
        this.calorie = calorie;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCalorie() {
        return calorie;
    }

    public int getPrice() {
        return price;
    }
}
