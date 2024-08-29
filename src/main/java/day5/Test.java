package day5;

import day2.Array;

import java.util.ArrayList;

public class Test {


    int a; // 변수 선언 => 선언과 동시에 초기화

    ArrayList<String> list = new ArrayList<>();
    ArrayList<String> list2= new ArrayList<>(){{
        add("apple");
        add("banana");
    }};


    int[] arr = new int[5];
    int[] arr2 = {1,2,3,4,5};

//    a = 10; // 대입연산
//    // 명령 코드 => 연산은 class에서 실행 불가능 => 연산은 메서드에서만 가능.
//    // 클래스에는 변수, 메서드 밖에 못옴.
//
//    a = 20;  //대입연산


    //ArrayList 초기화 방법

//    int[] arr = {1,2,3,4};
//    ArrayList<Integer> list = new ArrayList<>(){{
//        add(1);
//        add(2);
//        add(3);
//        add(4);
//    }};
}
