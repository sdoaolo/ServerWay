package App;

public class Main {
    public static void main(String[] args) {

        //app configurer 생성
        AppConfigurer appConfigurer = new AppConfigurer();

        //OrderApp (생성 - appconfigurer.어쩌구)
        OrderApp orderApp = new OrderApp();
        orderApp.start();

    }
}