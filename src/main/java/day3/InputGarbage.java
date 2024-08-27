package day3;

import java.util.Scanner;

public class InputGarbage {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        //모든 입력은 넥스트라인으로 통일하자
        // 숫자를 입력받을 때 문자로 받고 숫자로 변환
        //int num = Integer.parseInt("123")
        //System.out.println(num);


        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("나이 : ");
        int age = Integer.parseInt(sc.nextLine());


        System.out.println("안녕하세요. " + age + "살 " + name + "입니다.");
    }
}
