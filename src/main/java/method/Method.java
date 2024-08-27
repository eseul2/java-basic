package method;

// Function
public class Method {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.age = 20;
        p1.name = "홍길동";

        // 변수 -> 정보를 저장
        // 메서드 -> 동작을 수행

        Person p2 = new Person();
        p2.age = 30;
        p2.name = "이순신";


            // 문제 : 자동차가 달리게 해주세요.
//        Person p3 = new Person();
//        Person p4 = new Person();
//        Person p5 = new Person();
//        p3.run();
//        p4.run();
//        p5.run();


        // 문제 : 자동차 객체마다 서로 다른 최고속력을 가지도록 해주세요.
        Person p6 = new Person();
        Person p7 = new Person();
        p6.car = 220;
        p7.car = 250;

        p6.speed();
        p7.speed();

        // 문제 : 메서드 호출
        Person p8 = new Person();
        p8.hi();

        // 문제 : 메서드 정의
        Person p9 = new Person();
        p9.hi1();
        p9.bye();


        // 문제 : 메서드 매개변수1
        Person p10 = new Person();
        Person p11 = new Person();
        Person p12 = new Person();
        p10.num3 = 4;
        p11.num3 = 10;
        p12.num3 = 100;

        p10.dan();
        p11.dan();
        p12.dan();


















    }
}
