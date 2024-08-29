package day5;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayListExam {
    public static void main(String[] args) {


        // 생성


        // 배열
//    int[] arr = new int[5]; // 길이 5인 숫자 배열 생성


        // ArrayList
//    ArrayList<Integer> list = new ArrayList<>();  // Integer는 int의 또다른 모습

        // =========================================

        // 추가
        // 배열 -> 추가가 안된다.
        // ArrayList -> 추가 가능
        // 가장 앞에서부처 추가됨.
//        list. add(1); // 0번 방에 추가
//        list. add(2); // 1번 방에 추가
//


        // ==========================================
        //조회
        //배열
//        System.out.println(arr[0]);//arr 배열의 0번방 조회
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//
//
//    // ArrayList
//        System.out.println(list.get(0)); //list 배열의 0번방 조회
//        System.out.println(list.get(1));
//      System.out.println(list.get(2)); //list 배열의 2번방 조회 -> 2벙방이 존재하지 않기 때문에 에러남


        // =============================================
        // 수정
        //배열
//    arr[0] = 10; //arr 배열의 0번 방의 값을 10으로 수정.
//        System.out.println(arr[0]);
//
//    // ArrayList
//        list.set(0,10); // list 배열의 0번 방의 값을 10으로 수정.
//        System.out.println(list.get(0));

        // ================================================;
        // 삭제
        // 배열 -> 삭제 x
        //ArrayList
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//
//        list.remove(0); //0번방의 값을 삭제. 삭제하면 뒤에 있는 요소들이 앞으로 땡겨짐
//        System.out.println(list.get(0));
        //System.out.println(list.get(1)); //삭제해서 더이상 1번 방이 존재하지 않기 때문에 에러가 남.

        //================================================
        // 데이터의 개수 확인
        // 배열 -> length를 제공하기는 하지만 데이터의 개수랑 무관. 따로 내가 변수에 직접 보관해야함.

        // ArrayList
//        System.out.println(list.size()); //1
//        list.add(2);
//        list.add(3);

        // 배열보다 ArrayLIst가 사용성이 훨씬 편하므로 ArrayList를 주로 사용하고
        // 설능이 중요한 부분에서는 배열을 사용한다,


//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(5);
//        list.add(4);
//        list.add(3);
//        list.add(2);
//        list.add(1);
//        list.add(0);
//
//        System.out.println(list.size());
//
//        System.out.println(list.get(2));
//        System.out.println(list.get(3));
//
//        list.remove(0);
//        list.remove(1);
//
//        System.out.println(list.get(2));
//        System.out.println(list.get(3));

        // ArrayList 같은 경우는 조금 달라요
        //ArrayList는 타임(자료형)을 객체만 다룬다.

        // 객체형 자료형(리모콘), 원시형 자료형(int, boolean, double) 두가지로 구분.

        //그래서 원시형의 객체형 자료형을 제공
        // int -> Intteger
        // char -> Character
        // double -> Double
        // byte -> Byte
        //원시형 타입명에서 앞글자만 대문자로 바꾸면 객체형


        //Arrray 배열 문제1
        //선언
        ArrayList<Integer> list = new ArrayList<>();

        //add()
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);

        // size (출력)
        System.out.println(list.size());

        System.out.println(list.get(2));
        System.out.println(list.get(3));

        list.remove(0);
        list.remove(1);

        System.out.println(list.get(2));
        System.out.println(list.get(3));


        for (Integer num : list) {
            System.out.println(num);
        }
        System.out.println();


        ArrayList<String> list4 = new ArrayList<>();
        list4.add("홍길동");
        list4.add("이순신");
        list4.add("황진이");
        list4.add("임꺽정");
        list4.add("강감찬");
        list4.add("을지문덕");

        System.out.println(list4.size());

        System.out.println(list4.get(2));
        System.out.println(list4.get(3));


        // 중요합니다!!
        // 수천개의 데이터가 있을 때 일일이 어떤 값의
        // 인덱스를 찾기 힘들기 때뭉에 이 방법으로 사용합니다.

        for (String name : list4) {
            System.out.println(list4);

            for (int i = 0; i < list4.size(); i++) {
                if (list4.get(i).equals("임꺽정")) {
                    list4.set(i, "신사임당");
                }

                if (list4.get(i).equals("을지문덕")) {
                    list4.set(i, "유관순");
                }

            }
        }


        for (String name : list4) {
            System.out.println(name);
        }


        list4.add("정약용");

        for (String name : list4) {
            System.out.println(name);
        }



        list4.set(1, "신사임당");
        list4.set(3, "유관순");

        for (String name2 : list4) {
            System.out.print(name2);
        }

        System.out.println(list4.get(0));
        System.out.println(list4.get(1));
        System.out.println(list4.get(3));


    }
}












