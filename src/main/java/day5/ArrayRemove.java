package day5;

public class ArrayRemove {
    public static void main(String[] args) {


        // 10개 짜리 숫자 배열
        int[] arr = new int[10]; //배열은 길이가 정해져야 함.


        int count = 0; // 내가 저장한 정보의 개수를 기억하기 위함

        arr[0] = 1;
        count++;

        arr[1] = 2;
        count++;

        arr[2] = 3;
        count++;

        arr[3] = 4;
        count++;

        arr[4] = 5;
        count++;

        // 저장한 숫자를 출력
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }

        // 1,2,3,4,5
        // 3 삭제 => 1,2,4,5

//        arr[2] = arr[3];
//        arr[3] = arr[4];
//        arr[4] = arr[5];   // ....

        //숫자 2부터 데이터가 4까지
        // 위에껄 반복문으로 표현한것.
        for (int i = 2; i < count - 1; i++) {
            arr[i] = arr[i + 1];
        }
        count--;


        //배열에서 요소를 삭제하는 것은 불가능. 배열에서 한 번 길이가 정해지면 바꿀 수 없다!
        // 삭제된 것처럼 보이게 해야함.

        // 배열은 단점이 있다 -> 길이가 고정되어 있어서.
        // 유연성이 떨어지고 삭제나 추가 기능이 복잡하다.

        // 해결 -> 길이를 유동적으로 변하게 하는 배열을 사용하면 된다 => 동적배열 (ArrayList)
        // 배열은 사용성이 떨어지니까 사용성이 편한 동적 배열을 쓰자


    }
}
