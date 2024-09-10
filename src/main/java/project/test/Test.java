package project.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("원하는 페이지 : ");
        int currentPageNo = Integer.parseInt(sc.nextLine());

        for(int i = 1; i <=5; i++) {
            if (i == currentPageNo) {
                System.out.print("[" + i + "]" + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
