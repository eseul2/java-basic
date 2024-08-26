package day2;

public class Array {
    public static void main(String[] args) {


        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        System.out.println(a);


        //변수가 많아지면 변수를 관리하는 것도 힘들고 사용하는 것도 힘들다.
        // 1. 변수명이 많아져서 힘듦 -> 변수명을 한 개만 쓰면 됨.
        // 2. 변수가 많아서 다 사용하기 힘듦. -> 반복문을 사용하면 됨.

        // 결론 : 배열을 사용하면 된다.

        // 배열 사용할 땐 0부터 시작하는걸 기억해라.

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println(arr[3]);
        System.out.println(arr[0]);

        arr[2] = 100; // 배열의 특정 위치의 값을 새로운 값으로 대입 가능
        System.out.println(arr[2]);


        for (int i = 0; i <= 4; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("===============================");


        //숫자 10, 20, 30, 40, 50, 60, 70, 80, 90, 100
        // 배열에 저장하고 출력

        int[] arr1 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        for (int i1 = 0; i1 < 10; i1++) {
            System.out.println(arr1[i1]);
        }

        System.out.println("=================================");


        // 배열의 길이 정보 확인 .length
        System.out.println(arr1.length);

        for (int i1 = 0; i1 < arr1.length; i1++) {
            System.out.println(arr1[i1]);
        }


        //내가 저장할 값이 몇 개인지 모를 때, 개수를 알아도 구체적인 값을 모를 때
        // 비어있는 배열을 만들어놓고 나중에 값을 저장할 수도 있어야 함.

        // 10개 짜리 비어있는 배열을 만들기 (나중에 값을 입력해야 할 때 사용)
        int[] arr3 = {0, 0, 0, 0};

        int[] arr4 = new int[10];

        // 위에 두 개 동일한 코드

        System.out.println(arr3.length);
        System.out.println(arr4.length);

        arr4[4] = 10;

        System.out.println(arr4[4]);

        System.out.println("===========================");


        //세번 출력
        int[] arr5 = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j <= arr5.length; j++)
                System.out.println(arr5[i]);
        }


        System.out.println("==========================");



        // 거꾸로 출력

        int[] arr6 = {1, 2, 3, 4, 5};

        System.out.println("Original array:");
        for (int i = 0; i < arr6.length; i++) {
            System.out.print(arr6[i] + " ");
        }

        System.out.println("\nReversed array:");
        for (int i = arr6.length - 1; i >= 0; i--) {
            System.out.print(arr6[i] + " ");
        }

        //숫자 배열 -> 숫자만 저장 가능. 다른 타입은 불가능
        int[] arr7 = {1,2,3,4,5};

        String[] arr8 = {"apple", "banana", "orange"};
        boolean[] arr9 = {true, false,};

    }
}










