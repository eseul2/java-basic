package method;

// 객체(사물 표현) -> 상태/동작 -> 변수와 메서드의 집합이다.
public class Person {


    // 변수는 상태를 표현한다.
    int age;
    String name;

    // 매서드는 동작(연산)을 표현한다.
    // 접근제어자 리턴타임 메서드명(매개변수) {내용}
    // 동작은 일단 쉽게 출력으로 대체할 것임.
    public void walk() {
        System.out.println("사람이 걷습니다.");

    }

    // 매게변수
    public void introduce(String name2, int age2) {
        System.out.println("안녕하세요 " + age2 + "살" + name2 + " 입니다.");
    }

    public void run() {
        System.out.println("자동차가 달립니다.");
    }

    int car;

    public void speed(){
        System.out.println("자동차가 최대속력" + car + "km로 달립니다." );
    }


            // 문제 :
    public void hi(){
        System.out.println("안녕하세요!!");
        System.out.println("저는 차태진 입니다.");

    }


        // 문제
    public void hi1(){
        System.out.println("안녕하세요. 저는 홍길동입니다. 잘부탁드립니다.");
    }
    public void bye(){
        System.out.println("안녕히 가세요. 다음에 또 봐요!");
    }


    //문제 :
    int num3;

    public void dan(){
        System.out.println(num3);
    }



}




