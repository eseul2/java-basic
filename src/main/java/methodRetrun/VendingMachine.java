package methodRetrun;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    // 깂을 세팅 x
// 연습용으로 하나의 객체만 사용할 때는 미리 넣어두는 것이 편하니까 그냥 넣어둠.


    int remainder = 0;
//    String[] names = {"콜라", "사이다", "커피"};
//    int[] prices = {1000, 1200, 800};
//    int[] quantities = {1,2,1}; //두군데서 사용을 하기 위에 바깥쪽에 빼놓는다.

//    ArrayList<String> names = new ArrayList<>(){{
//    add("콜라");
//    add("사이다");
//    add("커피");                  //이렇개 하는 방법과
//    }};
//
//    ArrayList<Integer> prices = new ArrayList<>(List.of(1000,2000,800));
//
//    // 위처럼 List.of 를 써서 사용하는 방법이 있다.
//
//    ArrayList<Integer> quantities = new ArrayList<>(List.of(1,2,1));


    ArrayList<Beverage> beverages = new ArrayList<>();


    public VendingMachine() {
        Beverage b1 = new Beverage("콜라", 1000, 1);
        Beverage b2 = new Beverage("시이다", 1200, 2);
        Beverage b3 = new Beverage("커피", 800, 1);
        beverages.add(b1);
        beverages.add(b2);
        beverages.add(b3);

    }
}



//    public void inputMoney(int money) {
//        remainder = remainder + money;   //나중에 잔액을 확인하기 위해서 나머지와 현재 입금한 돈을 저장.
//    }
    //어떤 변수의 값에 연산자를 한 다음 다시 그 변수에 넗는다. 증감연산
    //증감연산의 경우 짧게 표현하는 방벚 존재. 규칙이 있다.
    //remainder += money; //위와 같은표현

    //두개의 선택지가 있기 때문에 (잔액부족,음료) if문을 사용한거임
//    public String selectBeverage(int target) {
//        if (prices.get(target) > remainder) {
//
//            Beverage beverage = beverages.get(target);
//
//            if (beverage.price > remainder) {
//                return "잔액부족"; // retrun 하게 되면 메서드는 거기서 종료. 더이상 밑으로 안내려감.
//            }
//            if (beverage.quantity <= 0) {
//                return "수량부족";
//            }
//
//            //remainder = remainder - prices[target];
////        remainder -=prices.get(target); //같은 방법입니다. 좀더 쉽게
//            remainder -= beverage.price;
//
//
//            // quantities[target] = quantities[target] -1;
////        quantities.set(target, quantities.get(target) - 1);
////        return names.get(target);
//            beverages.quantity--;
//
//            return beverages.name;
//
//
//            public int getRemainder () {
//                return remainder;    // 잔액을 표시하기 위해 러턴해서 잔액 값을 불러온다.
//            }
//
//            //void 는 값을 리턴하지 않아도 되서 사용?
//            public void printBeverages () {
//                System.out.println("=== 음료수 목록 ===");
//                for (int i = 0; i < names.size(); i++) {  //length 사용하는건 나열
//                    System.out.println(i + ". " + names.get(i) + " : " + prices.get(i) + "원, " + "남은 수량 : " + quantities.get(i));
//                }
//            }
//        }





















