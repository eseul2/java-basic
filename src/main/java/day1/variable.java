package day1;

public class variable {
    public static void main(String[] args) {
        //변수
        // 홍길동의 나이가 20
        //홍길동 나이가 21로 올라감
        System.out.println(21);
        System.out.println(21);
        System.out.println(21);
        System.out.println(21);
        System.out.println(21);

        // 변수를 사용해서 값을 저장할 수 있다.

        // 변수는 상자
        //  상자는 이름이 있어야함
        // 상자는 크기와 모양이 있어야 함

        //숫자
        //상자(변수)를 만들어야 함.
        // 숫자 이름;
        int age;

        // 값을 변수에 담아야 함.
        // = 을 이용해서 저장 가능
        age = 20;

        // 문자
        //문자 이름;
        String name;
        name = "홍길동";

        //변수의 값을 꺼내서 사용
        System.out.println(age);
        System.out.println(name);


        // 안녕하세요 저는 홍길동입니다. 10번 출력
        // 홀길동의 나이가 21살이 되었습니다. 21살로 바꿔서 10번 출력해주세요

        //홀길동이 홍길만으로 개명을 했습니다. 바뀐 이름을 적용해서 10번 출력
        int age2;
        System.out.println("안녕하세요 저는 21살 홍길동입니다.");

        //변수 사용시 주의사항
        //동일한 이름의 변수가 2개 이상 존재할 수 없다.
        //변수명이 숫자나 특수기호로 시작해서는 안된다. 숫자에 한해서는 뒤쪽에 붙이는건 가능
        //변수는 재활용 가능
        //변수는
        int a;
        a = 10;
        System.out.println(a);
        a = 20;
        System.out.println(a);


        int age3;
        age = 24;

        String name2;
        name2 = "홍길만";

        System.out.println("안녕하세요 저는 " + age + "살 " + name2 + "입니다.");



        int age4;
        age4 = 30;

        String name4;
        name4 = "김이슬";

        System.out.println("안녕하세요 저는 " + age4 + "살 " + name4 + "입니다.");



        int age5;
        age5 = 10;
        String name5;
        name5 = "박도하";

        System.out.println("안녕하세요 저는 " + age5 + "살 " + name5 +" 입니다.");




        int price;
        price = 5000;
        String i;
        i = "사과";

        System.out.println("이 " + i + "는 " + price + "원 입니다.");

        int age6;
        age6 = 10;

        System.out.println("나는 " + age6 + " 살 이야");


    }
}
