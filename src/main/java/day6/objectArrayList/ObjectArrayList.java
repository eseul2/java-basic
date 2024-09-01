package day6.objectArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ObjectArrayList {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


//        ArrayList<Integer> ages = new ArrayList<>();
//        ArrayList<String> names = new ArrayList<>();

        ArrayList<Name> Name1 = new ArrayList<>();


        // 변수 -> 명사(저장하려는 값과 관계 있어야 함), 메서드(동작) -> 동사(동작하는 것과 관계있어야함)


        while (true) {
            System.out.print("명령어 입력 : ");
            String num = sc.nextLine();

            if (num.equals("help")) {
                System.out.println("add : 이름 입력");
                System.out.println("list : 이름 목록");
                System.out.println("exit : 종료");


            } else if (num.equals("add")) {
                System.out.print("이름을 입력해주세요. : ");
                String names = sc.nextLine();
                System.out.print("나이를 입력해주세요. : ");
                int ages = (Integer.parseInt(sc.nextLine()));

                Name n1 = new Name();
                n1.name = names;
                n1.age = ages;
                Name1.add(n1);

                System.out.println(names + " , " + ages + "이 명부에 저장 되었습니다.");


                //n1 변수가 사라지기 전에 n1에 저장돤 name리모콘을 배열에 저장


            } else if (num.equals("list")) {
                System.out.println("==== 이름 목록 ====");

                for (int i = 0; i < Name1.size(); i++) {
                    System.out.println(Name1.get(i).name);
                    System.out.println(Name1.get(i).age);


                }
            } else if (num.equals("exit")) {
                System.out.println("이름 프로그램이 종료됩니다.");
                break;
            }


        }

    }
}



