package last;

import java.util.ArrayList;

public class ExceptionHandle {
    public static void main(String[] args) {

        // 에외처리

        ArrayList<String> arr = new ArrayList<>();

        arr.add("apple");
        arr.add("banana");
        arr.add("orange");

        try {
            System.out.println(arr.get(3));  //예외 발생코드
        } catch(IndexOutOfBoundsException e) {
            System.out.println("3번 인덱스는 없습니다.");
        }


        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누면 안돼요");
        }
        System.out.println("hihi");



    try {
        System.out.println(arr.get(3));  //예외 발생코드
        System.out.println(10 / 0);
    } catch (ArithmeticException e) {
        System.out.println("0으로 나누면 안돼요");
    } catch (IndexOutOfBoundsException e) {
        System.out.println("인덱스를 벗어났습니다.");
    }


        try {
            System.out.println(arr.get(3));  //예외 발생코드
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누면 안돼요");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("인덱스를 벗어났습니다.");
        } finally {
            System.out.println("여기는 무조건 실행되고 끝남"); //어떤 예외든 간에 무조건 실행하고 싶은건 마지막에 적으면 된다.
        }







    }
}



