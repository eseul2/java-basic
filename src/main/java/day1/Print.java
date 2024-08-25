package day1;

public class Print {

    // 주석 (commit) : 사람이 보기 위한 코멘트. 컴퓨터는 무시합니다.
    //여러줄 주석 : 컨트롤 + /
    public static void main(String args[]) {

        // 프로그램 명령어(코드)는 위에서 아래로 순차 실행.

        // 출력 System.out.print() 괄호 안의 값을 콘솔에 입력

        System.out.print(100);
        System.out.print(777);

        // 출력 System.out.println() : 출력 후 줄 바꿈 해주는 명령어
        System.out.println(100);
        System.out.println(777);

        // 문자의 경우는 ""를 이용해 구별해야 한다.
        System.out.println("김이슬");

        // 더하기
        System.out.println(100 + 200);

        // 100 + 200 = 300
        System.out.println("100 + 200 = 300");


        // 문자 + 문자 = 이어붙이기
        // 문자 + 숫자 = 숫자가 문자가 되어서 이어붙이기
        // 숫자 +숫자 = 더하기 산술 연산
        System.out.println("100 + 200 =" + 300);
        System.out.println("100 + 200 =" + (100 + 200));
        System.out.println("100 + 200 =" + "300");

        // 하나의 출력문에서 줄바꿈하기
        // 줄바꿈 문자 : \n
        System.out.println("안녕하세요\n반갑습니다.");

        //실습문제
        //구구단 2단을 이용해서 System.out.print 한번만 사용해서 출력


    }

}