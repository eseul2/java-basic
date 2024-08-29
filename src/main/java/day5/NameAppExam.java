package day5;

import java.util.Scanner;

public class NameAppExam {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        NameApp introduce = new NameApp();


        String[] ages = new String[5];
        int index2 = 0;
        String[] names = new String[5];
        int index = 0;


        while (true) {
            System.out.print("명령어 입력 : ");
            String num = sc.nextLine();

            if (num.equals("help")) {
                System.out.println("add : 이름 입력");
                System.out.println("list : 이름 목록");
                System.out.println("exit : 종료");
            } else if (num.equals("add")) {
                System.out.print("이름을 입력해주세요. : ");
                names[index] = sc.nextLine();
                System.out.print("나이를 입력해주세요. : ");
                ages[index2] = sc.nextLine();
                System.out.println(names[index] + " , " + ages[index2] + "이 명부에 저장 되었습니다.");
                index++;
                index2++;
            } else if (num.equals("list")) {
                System.out.println("==== 이름 목록 ====");
                for (int i = 0; i < index; i++) {
                    for (int j = 0; j < index2; j++)
                        System.out.println(names[i] + " , " + ages[j]);

                }
            } else if (num.equals("exit")) {
                System.out.println("이름 프로그램이 종료됩니다.");
                break;
            }


        }
    }
}
