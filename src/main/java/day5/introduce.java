package day5;

import java.util.ArrayList;

public class introduce {
    public static void main(String[] args) {


        // 사람 생성
        // 이름, 나이로 생성


        // 이렇게 하면 힘드니까 아래의 방법으로 하는게 좋아요

//        ArrayList<String> names = new ArrayList<>();
//        ArrayList<Integer> ages = new ArrayList<>();
//
//        names.add("홍길동");
//        names.add("이순신");
//        names.add("임꺽정");
//        names.add("황진이");
//
//        ages.add(20);
//        ages.add(30);
//        ages.add(35);
//        ages.add(40);
//
//        for(int i = 0; i <names.size(); i++){
//            System.out.println("안녕하세요 " + ages.get(i) + "살" + names.get(i) + "입니다.");
//        }
//
//        names.remove(1);
//        ages.remove(1);
//
//        for(int i = 0; i <names.size(); i++){
//            System.out.println("안녕하세요 " + ages.get(i) + "살" + names.get(i) + "입니다.");
//        }


        Person p1 = new Person();
        p1.age = 24;
        p1.name = "홍길동";

        Person p2 = new Person();
        p2.age = 30;
        p2.name = "이순신";

        Person p3 = new Person();
        p3.age = 41;
        p3.name = "을지문덕";

        Person p4 = new Person();
        p4.age = 32;
        p4.name = "황진이";

        ArrayList<Person> people = new ArrayList<>();

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);


        for (int i = 0; i < people.size(); i++) {
            Person p = people.get(i);
            }



        // 이순신 제거
//        people.remove(1);
//        System.out.println("=================");
//
//        for (int i = 0; i < people.size(); i++) {
//            Person p = people.get(i);
//            p.introduce();
//        }

        // 2개 이상의 데이터로 표현되는 개념/사물은 무조건 겍체로 만들어라.


        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);

        System.out.println(list.size());

        System.out.println(list.get(2));
        System.out.println(list.get(3));



    }

}

