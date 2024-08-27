package day3;

// 명명규칙
// 클래스명은 대문자 시작
// 의미가 바뀔 때 대문자로 구분. 두 단어 이상의 조합으로 이름 지을 때
// 단어 의미가 바뀌면 바뀌는 단어의 앞문자를 대문자로 바꿈(띄어쓰가 불가능)
// 카멜 표기법 (자바에서 많이 쓴다.)
// 함수나 변수는 소문자로 시작.

import java.lang.module.FindException;
import java.net.BindException;
import java.util.Scanner;

public class NameApp {
    public static void main(String[] args) {

        // 명령어 입력 : help
        // add : 이름 입력
        // list : 이름 목록
        // exit : 종료
        // 명령어 입력 : add
        // 이름을 입력해주세요 : john
        // john이 명부에 저장되었습니다.
        // 명령어 입력 : list
        // ===== 이름 목록 =====
        // 1. john
        // =====================
        // 명령어 입력 : add
        // 이름을 입력해주세요 : tomas
        // tomas이 명부에 저장되었습니다.
        // 명령어 입력 : add
        // 이름을 입력해주세요 : chris
        // chris이 명부에 저장되었습니다.
        // 명령어 입력 : list
        // ===== 이름 목록 =====
        // 1. john
        // 2. tomas
        // 3. chris
        // =====================
        // 명령어 입력 : exit
        // 이름 프로그램이 종료됩니다.


        // "문자1" == "문자2" 틀린비교
        // "문자1".equals("문자2") 올바른 비교

        Scanner sc = new Scanner(System.in);

        //       String[] arr = {"help", "add", "list", "exit"};
        //      String name;


//        String[] names = new String[5]; //null
//        int index = 0;
//
//
//
//        while (true) {
//
//            System.out.print("명령어를 입력 해주세요 : ");
//            String num = sc.nextLine();
//
//            if (num.equals("help")) {
//                System.out.println("add : 이름입력");
//                System.out.println("list : 이름목록");
//                System.out.println("exit : 종료");
//            }
//
//            else if (num.equals("add")) {
//                System.out.println("이름을 입력해주세요. : ");
//                names[index] = sc.nextLine();
//                System.out.println(names[index] + " 이 명부에 저장 되었습니다.");
//                index++;
//            }
//
//
//            else if (num.equals("list")) {
//                System.out.println("===== 이름 목록 ====");
//                for(int i = 0; i < index; i++) {
//                    System.out.println(names[i]);
//                }
//            }
//
//            else if(num.equals("exit")){
//                System.out.println("이름 프로그램이 종료됩니다.");
//                break;
//            }
//        }




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
