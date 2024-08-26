package day2;

import java.util.Scanner;

public class InputExam {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //반복문 추가 문법 (while 로 무한반복)

        //반복문 강제 종료 : break
        //반복문 강제로 다음 회차 넘기기 : continue

//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 != 0) {
//                //break; // 강제종료
//                continue; // 다음 회차로 넘기기
//            }
//            System.out.println(i);
//        }
//
//        while (true) {
//            System.out.println("값을 입력해주세요 : ");
//            int num = sc.nextInt();
//
//            if(num == 0) { // num이 0이면 if문 실핼
//                break;
//            }
//            System.out.println("당신이 입력한 값은 : " + num);
//        }
//
//        System.out.println("프로그램이 종료되었습니다.");




        // 문제 : 스캐너를 이용한 사칙연산 프로그램 v2
        int[] arr = {1, 2, 3, 4, 5};

        while (true) {
            System.out.print("기능을 선택해주세요 (1.더하기, 2.빼기, 3.곱하기, 4.나누기, 5.종료) : ");
            int num = sc.nextInt();

            if (num == arr[0]) {
                System.out.println("첫번째 숫자를 입력해주세요 : ");
                int num2 = sc.nextInt();

                System.out.println("두번째 숫자를 입력해주세요 : ");
                int num3 = sc.nextInt();

                System.out.println(num2 + num3);
            } else if (num == arr[1]) {
                System.out.println("첫번째 숫자을 입력해주세요 : ");
                int num2 = sc.nextInt();

                System.out.println("두번째 숫자를 입력해주세요 : ");
                int num3 = sc.nextInt();

                System.out.println(num2 - num3);
            } else if (num == arr[2]) {
                System.out.println("첫번째 숫자을 입력해주세요 : ");
                int num2 = sc.nextInt();

                System.out.println("두번째 숫자를 입력해주세요 : ");
                int num3 = sc.nextInt();

                System.out.println(num2 * num3);
            } else if (num == arr[3]) {
                System.out.println("첫번째 숫자을 입력해주세요 : ");
                int num2 = sc.nextInt();

                System.out.println("두번째 숫자를 입력해주세요 : ");
                int num3 = sc.nextInt();

                System.out.println(num2 / num3);
            } else if (num == arr[4]) {
                System.out.println("계산기 프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("그런 기능은 존재하지 않습니다.");
            }
        }
    }
}
