package day6.bugerKiosk;

import java.util.Scanner;

public class BurgerKioskExam {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
//        ArrayList<BugerKiosk> b1 = new ArrayList<>();


        while(true){
            System.out.print("1. 햄버거 선택 2. 사이드 선택 3.음료수 선택 4.메뉴 취소 5.주문하기 : ");
            int menu = Integer.parseInt(sc.nextLine());


            if(menu == 1){
                System.out.println("어떤 버거를 고르시겠습니까?");
                int choice = Integer.parseInt(sc.nextLine());

            }


            else if(menu == 2){


                // 사이드 목록

            }
            else if(menu == 3){

                //음료수 목록

            }
            else if(menu == 4){

                //메뉴 취소

            }
            else if(menu == 5){

                //주문하기


            }






        }

    }
}
