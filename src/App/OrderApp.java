package App;

import App.Product.Product;
import App.Product.ProductRepository;
import App.Product.SubProduct.SubProductType.Drink;

import java.util.Scanner;

public class OrderApp {

    Cart cart;
    Menu menu;

    Scanner scanner = new Scanner(System.in);
    void start() {

        ProductRepository productRepository = new ProductRepository();
        Product[] products = productRepository.getProducts();

        Menu menu = new Menu(products);
        MenuHandler menuHandler = new MenuHandler();

        while(true) {
            //1. 메뉴출력
            printHome();
            //2. 사용자 입력
            int select = Integer.parseInt(scanner.nextLine());

            if (select == 1){ //제품선택
                printSelectProduct();
                int selectProdut = Integer.parseInt(scanner.nextLine());
                menu.printOrderSandwich();
                break;
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
        System.out.printf("☑️ 이용하실 서비스를 선택해주세요: \n\n");

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



}

/*


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