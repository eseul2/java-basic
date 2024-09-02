package day7.casting;

public class Casting {
    public static void main(String[] args) {

        // 자바의 대전제
        // 자료형(타입)이 같은 것만 변수에 저장해준다.

        int num = 10; // 정수 변수 정수만 들어올 수 있다.
        double num2 = 10.1; // 실수 변수. 실수만 들어올 수 있틈

       // num = num2;   // num2 값을 num에 대입 => x. double 타입이 int 타입에 대입될 수 없다.

        num2 = num; // num의 값을 num2에 대입 => o. int 타입이 double 타입에 대입되었다 (x)
        // int 타입이 double 타입으로 모습을 바꿔서(형변환) 대입되었다. (o)

        System.out.println(num2);


        // 정수가 실수가 되는 것은 안전하다. 정수에다가 .0을 넣기만 하면 되니꺼 ex. 10 -> 10.0
        // 실수가 정수가 되는 것은 위험하다. 10.3 -> 10 이렇게 소수점이 떨어져 나가니까 위험

        // 안전한 변환은 자바가 자동으로 대신 해준다.  (자동형변환)
        // 위험한 변환은 자바가 막는다. (실수를 정수로 바꿔주지 x). 에러가 나고 개발자가 강제로 변환은 가능(수동형변환)



        num2 = num; // 안전한 자동 형변환
        num = (int)num2;  //값 앞에 () 표현으로 형변환을 강제로 시도할 수 있다.




    }
}
