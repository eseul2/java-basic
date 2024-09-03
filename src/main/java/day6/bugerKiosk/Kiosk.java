package day6.bugerKiosk;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        ArrayList<Burger> burgers = new ArrayList<>();
        ArrayList<Burger> burgerCart = new ArrayList<>();

        ArrayList<Side> sides = new ArrayList<>();
        ArrayList<Side> sideCart = new ArrayList<>();

        ArrayList<Drink> drinks = new ArrayList<>();
        ArrayList<Drink> drinkCart = new ArrayList<>();

        Burger b1 = new Burger("한우불고기버거", 6000);
        Burger b2 = new Burger("치즈버거", 3000);
        Burger b3 = new Burger("치킨버거", 3500);
        Burger b4 = new Burger("새우버거", 3200);
        burgers.add(b1);
        burgers.add(b2);
        burgers.add(b3);
        burgers.add(b4);

        Side s1 = new Side("감자튀김", 1800);
        Side s2 = new Side("치즈스틱", 2000);
        Side s3 = new Side("치킨너겟", 2500);
        Side s4 = new Side("오징어링", 2700);
        sides.add(s1);
        sides.add(s2);
        sides.add(s3);
        sides.add(s4);

        Drink d1 = new Drink("콜라", 1000);
        Drink d2 = new Drink("에이드", 2000);
        Drink d3 = new Drink("커피", 1500);
        Drink d4 = new Drink("쉐이크", 2500);
        drinks.add(d1);
        drinks.add(d2);
        drinks.add(d3);
        drinks.add(d4);

        int cancelIndex = 0;






        // 목록
        System.out.println("햄버거 키오스크 v1");
        while (true) {
            System.out.println("1.햄버거 선택");
            System.out.println("2.사이드 선택");
            System.out.println("3.음료수 선택");
            System.out.println("4.메뉴 취소");
            System.out.println("5. 주문 하기");
            System.out.println("=== 주문 목록 === ");

            System.out.print("버거 : [");
            for (int i = 0; i < burgerCart.size(); i++) {
                System.out.print(burgerCart.get(i).name + " ");
            }
            System.out.println("]");
            System.out.print("사이드: [");
            for (int i = 0; i < sideCart.size(); i++) {
                System.out.print(sideCart.get(i).name + " ");
            }
            System.out.println("]");
            System.out.print("음료수: [");
            for (int i = 0; i < drinkCart.size(); i++) {
                System.out.println(drinkCart.get(i).name + " ");
            }
            System.out.println("]");


            // 목록과 토탈 금ㅇ액 구현

            int total = 0;

            for (Burger burger : burgerCart) {
                total = total + burger.price;
            }
            for (Side side : sideCart) {
                total = total + side.price;
            }
            for (Drink drink : drinkCart) {
                total = total + drink.price;
            }

            System.out.println("총금액 : " + total);
            System.out.print("무엇을 하시겠습니까 : ");
            int menu = Integer.parseInt(sc.nextLine());



            // 1번 햄버거 목록 주문

            if (menu == 1) {
                System.out.println("=== 햄버거 목록 ===");
                for (int i = 0; i < burgers.size(); i++) {
                    System.out.printf("%d. %s %d\n", i + 1, burgers.get(i).name, burgers.get(i).price);
                }
                System.out.println("어떤 버거를 고르시겠습니까? : ");
                int choiceNo = Integer.parseInt(sc.nextLine()); //번호로 버거 선택

                Burger burger = burgers.get(choiceNo - 1); //선택한 번호로 버거 가져오기
                burgerCart.add(burger); //카트에 선택한 버거 추가
                burger.select();
            }


            // 2번 사이드 목록 주문

            else if (menu == 2) {
                System.out.println("=== 사이드 목록 ===");
                for (int j = 0; j < sides.size(); j++) {
                    System.out.printf("%d. %s %d\n", j + 1, sides.get(j).name, sides.get(j).price);
                }
                System.out.print("어떤 사이드를 고르시겠습니까? : ");
                int choiceNo = Integer.parseInt(sc.nextLine());

                Side side = sides.get(choiceNo - 1);
                sideCart.add(side);
                side.select();
            }


            // 3번 사이드 목록 주문

            else if (menu == 3) {
                System.out.println("=== 음료수 목록 ===");
                for (int k = 0; k < drinks.size(); k++) {
                    System.out.printf("%d. %s %d\n", k + 1, drinks.get(k).name, drinks.get(k).price);
                }
                System.out.print("어떤 음료수를 고르시겠습니까? : ");
                int choiceNo = Integer.parseInt(sc.nextLine());

                Drink drink = drinks.get(choiceNo - 1);
                drinkCart.add(drink);
                drink.select();
            }


            // 4번 메뉴 취소

            else if (menu == 4) {
                System.out.print("어떤 메뉴를 취소하겠습니까?");
                System.out.println("1. 버거");
                System.out.println("2. 사이드");
                System.out.println("3. 음료수");
                int cancleMenu = Integer.parseInt(sc.nextLine());


                // 취소할 버거 선택
                if (cancleMenu == 1) {
                    System.out.print("취소할 버거를 선택해주세요");
                    for (int i = 0; i < burgerCart.size(); i++) {
                        System.out.printf("%d. %s\n", i + 1, burgerCart.get(i).name);
                    }
                    System.out.print("선택: ");
                    int cancleIndex = Integer.parseInt(sc.nextLine()) - 1;
                    if (cancleIndex >= 0) {
                        System.out.println(burgerCart.get(cancleIndex).name + "가 취소되었습니다.");
                        burgerCart.remove(cancleIndex);
                    }
                }

                // 취소할 사이드 선택
                else if (cancleMenu == 2) {
                    System.out.println("취소할 사이드를 선택해주세요");
                    for (int i = 0; i < sideCart.size(); i++) {
                        System.out.printf("%d. %s\n", i + 1, sideCart.get(i).name);
                    }
                    System.out.print("선택: ");
                    int cancleIndex = Integer.parseInt(sc.nextLine()) - 1;
                    if (cancleIndex >= 0) {
                        System.out.println(sideCart.get(cancleIndex).name + "가 취소되었습니다.");
                        sideCart.remove(cancleIndex);
                    }

                }

                // 취소할 음료수 선택
                else if (cancleMenu == 3) {
                    System.out.println("취소할 음료수를 선택해주세요");
                    for (int i = 0; i < drinkCart.size(); i++) {
                        System.out.printf("%d. %s\n", i + 1, drinkCart.get(i).name);
                    }
                    System.out.print("선택: ");
                    int cancleIndex = Integer.parseInt(sc.nextLine()) - 1;
                    if (cancleIndex >= 0) {
                        System.out.println(drinkCart.get(cancleIndex).name + "가 취소되었습니다.");
                        drinkCart.remove(cancleIndex);
                    }
                }
            }


            // 5번 주문하기
            else if (menu == 5) {

                System.out.print("정말 주문하시겠습니까? y / n : ");
                String confirm = sc.nextLine(); //주문 확인 : confirm
                System.out.print("결제금액을 입력해주세요 : ");
                int payment = Integer.parseInt(sc.nextLine()); // 결제금액

                if (confirm.equals("y")) {
                    System.out.print("영수증을 발급 하시겠습니까? (y / n)");
                    String receipt = sc.nextLine(); // 영수증 : receipt

                    System.out.println("=== 영수증 ===");

                    for (Burger burger : burgerCart) {
                        total = total + burger.price;
                    }
                    for (Side side : sideCart) {
                        total = total + side.price;
                    }
                    for (Drink drink : drinkCart) {
                        total = total + drink.price;
                    }

                    System.out.println("총금액 : " + total);

                    System.out.println("===============");


                    //거스름돈



                    if (receipt.equals("y")) {
                        System.out.println("영수증이 발급 되었습니다.");
                    }
                    break;


                }
            }
        }
    }
}





