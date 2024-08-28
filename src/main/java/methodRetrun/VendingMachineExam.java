package methodRetrun;

import day3.Person;

import java.util.Scanner;

public class VendingMachineExam {
    public static void main(String[] args) {


        // 내가 한거

//        Scanner sc = new Scanner(System.in);
//        VendingMachine v1 = new VendingMachine();


//        while (true) {
//            System.out.println(" 1.돈 투입" + " 2.음료 선택" + " 3.음료 목록 확인" + " 4.잔액 확인" + " 5.사용 종료");
//            String num = (sc.nextLine());
//
//            if (num.equals("1")) {
//                System.out.print("돈을 투입해주세요.");
//                System.out.print(sc.nextLine());
//                v1.deposit(2000);
//
//            } else if (num.equals("4")) {
//                v1.balance(2000);
//            }
//            else if(num.equals("3")){
//                System.out.println("=== 음료수 목록 ===");
//                System.out.println("0. 콜라 : 1000원");
//                System.out.println("1. 사이다 : 1200원");
//                System.out.println("2. 커피 : 800원");
//            }
//            else if(num.equals("2")){
//                System.out.println("음료수를 선택해주세요.");
//                System.out.println(sc.nextLine());


        //    int menu = Integer.parseInt(sc.nextLine());  정수 까먹지 말기...

        Scanner sc = new Scanner(System.in);
        VendingMachine vm = new VendingMachine();

        int remainder = 0;
        String[] drink = {"콜라", "사이다", "커피"};       // 이거 말고.........

        while (true) {
            System.out.print("기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) :");
            int menu = Integer.parseInt(sc.nextLine());

            if (menu == 1) {
                System.out.println("돈을 투입해주세요.");
                int money = Integer.parseInt(sc.nextLine());
                System.out.println("현재 투입된 금액은" + money + "원 입니다.");
                remainder = remainder + money;   // 잔액 돈 기억하셈
            } else if (menu == 2) {
                System.out.println("음료수를 선택 해주세요.");
                int target = Integer.parseInt(sc.nextLine());
//                String beverage = vm.selectBeverage(target);??
                System.out.println("를 뽑으셨습니다. 남은 잔액은 " + remainder + "원 입니다. ");


            } else if (menu == 3) {
                System.out.println("== 음료수 목록 ==");


            } else if (menu == 4) {
                System.out.println("현재 잔액은 " + remainder + "원 입니다.");

            } else if (menu == 5) {
                System.out.println("자판기 프로그램을 종료합니다.");
                break;
            }


        }


//        else if (menu == 2) {
//
//                System.out.print("음료수를 선택해주세요 : ");
//                int target = Integer.parseInt(sc.nextLine());
//                String beverage = vm.selectBeverage(target);
//                System.out.println( beverage + "을/를 뽑으셨습니다.");
//                int remainder = vm.getRemainder();
//                System.out.println("잔액은 " + remainder + " 원입니다.");
//
//            }
//            else if (menu == 3) {
//                vm.printBeverages();
//            }
//            else if (menu == 4) {
//                int remainder = vm.getRemainder();
//                System.out.println("현재 잔액은 " + remainder + "원 입니다.");

// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 3
// == 음료수 목록 ==
// 0. 콜라 : 1000원
// 1. 사이다 : 1200원
// 2. 커피 : 800원

// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 2
// 음료수를 선택해주세요 : 0
// 콜라 를 뽑으셨습니다.
// 잔액은 1000 원입니다.

// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 4
// 현재 잔액은 1000원 입니다.

// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 3
// == 음료수 목록 ==
// 0. 콜라 : 1000원
// 1. 사이다 : 1200원
// 2. 커피 : 800원

// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 2
// 음료수를 선택해주세요 : 1
// 잔액이 부족합니다.

// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 1
// 돈을 투입해주세요 : 200
// 현재 투입된 금액은 200원입니다.

// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 4
// 현재 잔액은 1200원 입니다.

// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 3
// == 음료수 목록 ==
// 0. 콜라 : 1000원
// 1. 사이다 : 1200원
// 2. 커피 : 800원

// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 2
// 음료수를 선택해주세요 : 2
// 커피 를 뽑으셨습니다.
// 잔액은 400 원입니다.

// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 5
// 자판기 프로그램을 종료합니다. 남은 돈 400원이 반환됩니다.


//선생님

    }
}

