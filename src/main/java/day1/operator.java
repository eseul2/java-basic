package day1;

public class operator {
    public static void main(String[] args) {
        // 산술 연산자
        // +, -,*,/,%
        //더하기 빼기 곱하기 나누기


        //sout 탭하면 됨
        System.out.println(10 + 5);
        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println(10 / 5);
        System.out.println(10 % 5);

        System.out.println(10 / 3); //정수
        System.out.println(10.0 / 3.0); //실수

        System.out.println(10 % 3); // 나머지 구하는거임

        //비교 연산자 - 논리값으로 결과가 나옴
        // <,>,<=,>=,==,!=

        System.out.println(10 > 5); //맞음.
        System.out.println(10 < 5); // 틀림.

        System.out.println(100); //숫자 int 실수(소수) double
        System.out.println("100"); //문자 string

        System.out.println(true);
        System.out.println("true");

        System.out.println(!true);
        System.out.println(!false);

        //자료형 (타입)
        //숫자(정수) int 실수(소수) double
        //문자 string




        if ( true ) {
            System.out.println("참");
        }

        if ( false ) {
            System.out.println("거짓");
        }

        int a = 10;
        // `==` => 같다.
        if ( a == 10 ) {
            System.out.println("참");
        }

        // `!=` => 같지 않다.
        if ( a != 10 ) {
            System.out.println("거짓");
        }

        if ( a > 10 ) {
            System.out.println("거짓");
        }

        if ( a >= 10 ) {
            System.out.println("참");
        }

        int b = 10;

        if ( a == b ) {
            System.out.println("참");
        }

        //boolean c => c 에는 오직 true/false 만 담을 수 있다.

        boolean c = a != b;

        if ( c ) {
            System.out.println();
        }

        if ( c == false ) {
            System.out.println();
        }

        // `!` => 반전
        if ( !c ) {
            System.out.println();
        }

        // `!` => 반전
        if ( !(!c) ) {
            System.out.println();
        }

        boolean d = true;

        if ( c != d ) {
            System.out.println();
        }


        System.out.println(10 > 5);
        System.out.println(10 < 5);
    }


}
