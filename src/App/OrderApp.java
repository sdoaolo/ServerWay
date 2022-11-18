package App;

import App.Product.Product;
import App.Product.ProductRepository;
import App.Product.SubProduct.SubProductType.Drink;

import java.util.Scanner;

public class OrderApp {

    Cart cart;
    Menu menu;
    //ProductRepository productRepository = new ProductRepository();

    Scanner scanner = new Scanner(System.in);
    void start() {

        while(true) {
            //1. 메뉴출력
            printHome();
            //2. 사용자 입력
            int select = Integer.parseInt(scanner.nextLine());

            if (select == 1){ //제품선택
                printSelectProduct();
            }
            else if(select == 2){ //장바구니
                //장바구니 출력
            }
        }
    }

    private void printHome() {
        System.out.println("-".repeat(60));
        System.out.println("🥪 ServerWay Order Service  🥪");
        System.out.println("-".repeat(60));

        System.out.println("[📣] 안녕하세요! ");
        System.out.println("☑️ 이용하실 서비스를 선택해주세요 : ");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println("[1. 제품선택]");
        System.out.println("[2. 장바구니]");

        System.out.println("-".repeat(60));
    }
    private void printSelectProduct(){
        System.out.println("[📣] 제품 선택하기 ");
        System.out.println("☑️ 주문할 제품을 선택해주세요 : ");
        System.out.println("-".repeat(60));

        System.out.println("[1. 샌드위치 단품 주문하기]");
        System.out.println("[2. 사이드 단품 주문하기]");
        System.out.println("[3. 세트 주문하기]");
        System.out.println("[4. 콤보 선택하기]");
        System.out.println("[5. 돌아가기]");
        System.out.println("-".repeat(60));

    }

    private void printOrderSandwich() {

        System.out.println("[📣] 샌드위치 주문하기 __ 🥪");
        System.out.println("☑️ 샌드위치 제품을 선택해주세요 : ");
        System.out.println("-".repeat(60));

        int num = Integer.parseInt(scanner.nextLine());
        System.out.println("[1. 🍗 로스트 치킨 샌드위치]");
        System.out.println("[2. 🥚 에그마요 샌드위치]");
        System.out.println("[3. 🥓 이탈리안 BMT 샌드위치]");
        System.out.println("[4. 🥬 베지테리안 전용 샌드위치]");

        System.out.println("-".repeat(60));
    }

    private void printBreadOption(){

        System.out.println("☑️ 빵을 선택해주세요 __ 🥖");
        System.out.println();
        System.out.println("길이: ");
        System.out.println("[1. 15cm] [2. 30cm]");
        int selectSide = Integer.parseInt(scanner.nextLine());

        System.out.println();
        System.out.println("굽기 : ");
        System.out.println("[1. 굽기] [2. 굽기선택안함]");

        System.out.println();
        System.out.println("종류: ");
        System.out.println("[1. 화이트] [2. 위트] [3. 허니오트]");

        System.out.println("-".repeat(60));


    }

    private void printCheeseOption() {
        System.out.println("☑️ 치즈를 선택해주세요 __ 🧀");
        System.out.println();
        System.out.println("종류: ");
        System.out.println("[1. 아메리칸] [2. 모차렐라] [3. 치즈 제외]");
        int selectSide = Integer.parseInt(scanner.nextLine());

        System.out.println();
        System.out.println("치즈를 추가하시겠습니까? :");
        System.out.println("[1. 아메리칸] [2. 모차렐라] [3. 추가안함]");

        System.out.println("-".repeat(60));
    }

    private void printVegetableOption() {
        System.out.println("☑️ 제외할 야채를 선택해주세요 __ 🥬 (최대 6개)");
        System.out.println();
        System.out.println("종류: ");
        System.out.println("[1. 제외할 야채 없음] [2. 양상추] [3. 토마토]\n" +
                "[4. 오이] [5. 피클] [6. 올리브] [7. 할라피뇨]");
        int selectSide = Integer.parseInt(scanner.nextLine());

        System.out.println();
        System.out.println("[0. 선택완료]");

        System.out.println("-".repeat(60));
    }
    private void printSauceOption() {
        System.out.println("☑️ 소스를 선택해주세요 __🥫 (최대 3개)");
        System.out.println();
        System.out.println("종류: ");
        System.out.println("[1. 머스타드] [2. 스위트 어니언] [3. 스모크 바베큐]\n" +
                "[4. 렌치] [5. 올리브오일] [6. 선택안함]");
        int selectSide = Integer.parseInt(scanner.nextLine());

        System.out.println();
        System.out.println("[0. 선택완료]");

        System.out.println("-".repeat(60));
    }


    private void printOtherIngredientOption() {
        System.out.println("☑️ 추가할 재료를 선택해주세요 __🥑 (최대 5개)");
        System.out.println();
        System.out.println("종류: ");
        System.out.println("[1. 에그마요] [2. 페퍼로니] [3. 베이컨]\n" +
                "[4. 아보카도] [5. 오믈렛] [6. 선택 안함]");
        int selectSide = Integer.parseInt(scanner.nextLine());

        System.out.println();
        System.out.println("[0. 선택완료]");

        System.out.println("-".repeat(60));
    }


    private void printOrderSide(){

        System.out.println("[📣] 사이드 주문하기 __ 🍪🍟🥤");
        System.out.println("☑️ 사이드를 선택해주세요 : ");
        System.out.println();

        System.out.println("[1. 쿠키] [2. 칩] [3. 웨지 또는 스프] [4. 음료]");
        System.out.println("-".repeat(60));

        int selectSide = Integer.parseInt(scanner.nextLine());
        /*
        switch (selectSide){

        }
        */
    }
    private void printCookieOption() {
        System.out.println("☑️ 쿠키를 선택해주세요 : ");
        System.out.println();
        System.out.println("[1. 라즈베리치즈쿠키] [2. 더블초코칩쿠키] [3. 초코칩쿠키]");
        int selectSide = Integer.parseInt(scanner.nextLine());
        System.out.println();
        System.out.println("-".repeat(60));
    }
    private void printChipsOption() {
        System.out.println("☑️ 칩을 선택해주세요 : ");
        System.out.println();
        System.out.println("[1. 포카칩] [2. 포테이토칩] [3. 스윙칩]");
        int selectSide = Integer.parseInt(scanner.nextLine());
        System.out.println();
        System.out.println("-".repeat(60));
    }

    private void printWedgeAndSoupOption() {
        System.out.println("☑️ 웨지 또는 스프를 선택해주세요 :");
        System.out.println();
        System.out.println("[1. 웨지포테이토] [2. 해쉬브라운]\n" +
                "[3. 브로콜리체다스프] [4.양송이스프]");
        int selectSide = Integer.parseInt(scanner.nextLine());
        System.out.println();
        System.out.println("-".repeat(60));
    }
    private void printDrinkOption() {
        System.out.println("☑️ 음료를 선택해주세요 :");
        System.out.println();
        System.out.println("[1. 콜라] [2. 제로콜라] [3. 사이다] [4.아메리카노]");
        int selectSide = Integer.parseInt(scanner.nextLine());
        System.out.println();
        System.out.println("-".repeat(60));
    }
}

/*

# 세트 주문하기
[📣] 세트 주문하기 __ 🥪🍪🥤
/////#쿠키선택하기/칩 선택하기/#음료선택하기 출력/////

# 콤보 주문하기
[📣] 콤보 주문하기 __ 🥪🥤
/////  #음료 선택하기 출력  /////

------------------------------




#장바구니 출력 기능
----------------------------------------------------
🛒 장바구니

(세트) 로스트 치킨 샌드위치, 라즈베리치즈쿠키, 제로콜라
----- 15cm/굽기/화이트
----- 아메리칸, 모짜렐라
----- 제외할 야채 없음
----- 머스타드, 렌치
----- 아보카도
-> 6700원


(단품) 에그마요 샌드위치
----- 30cm/굽기선택안함/위트
----- 아메리칸
----- 오이, 피클, 할라피뇨 제외
----- 머스타드, 렌치
-> 5000원									//필수 선택요소가 아닌 것은 미선택시 출력에서 아예 빼버림)

(콤보) 베지테리안 샌드위치, 아메리카노
----- 15cm/굽기/화이트
----- 아메리칸, 아메리칸
----- 토마토 제외
----- 머스타드, 올리브오일, 후추
----- 오믈렛

(사이드) 양송이스프
(사이드) 해쉬브라운
------
-> 6000원

----------------------------------------------------
[1. 돌아가기][2. 결제하기][3. 장바구니에서 삭제][4. 장바구니 비우기]




## 장바구니에서 삭제
☑️ 삭제할 제품을 선택해주세요 :
[1. 로스트 치킨 샌드위치(세트)
[2. 에그마요 샌드위치(단품)]
[3. 베지테리안 샌드위치(콤보)]



## 결제하기

☑️ 할인 수단을 선택해주세요 :
///// #할인출력기능 /////
///// #결제금액출력기능 /////
------------------------------
[1. 할인 추가][2. 할인 삭제][0. 결제하기 ] [9. 돌아가기 ]




#할인 관련 기능
##- 할인 출력 기능


[1. 연령할인 : 초등학생이나 60세 이상 샌드위치가 포함된 제품 1000원 할인]
[2. 런치할인 : 점심시간 (11시 ~ 2시) 동안 세트 구매시 2000원 할인]
[3. 통신사할인 : SKT, KT 통신사라면, 10% 할인 ]
[4. 날짜할인 : 5월은 어린이날! 어버이날! 어린이와 어버이를 위한 특급이벤트 22% 할인]
------------------------------------------------------------


##할인 적용?확인?????????
☑️ 적용된 할인
[1. 연령할인(1000원)], [3.통신사할인(10%)]

##할인 삭제 기능
☑️ 취소할 번호을 선택해주세요 : 3



#결제 금액 출력 기능

금액 합계 : xxxx원
적용된 할인 : 연령할인(1000원)
-----------------------------------------
최종 결제 금액 : xxxxx원


#결제 결과 출력 기능

[📣] 주문이 완료되었습니다.
[📣] 주문 내역은 다음과 같습니다.
-----------------------------------------

/////#장바구니 출력기능/////

-----------------------------------------
/////#결제 금액 출력 기능/////

[📣] 결제가 완료되었습니다.
     이용해주셔서 감사합니다 :)
 */