package day8.accessModifer;

public class AccessModifier {
    public static void main(String[] args) {

        // 자원(변수 + 메서드 )에 접근할 수 있는 권한.
        // public : 모두 사용 가능
        // private : 자신만 사용 가능


        Calculator c1 = new Calculator();
        c1.divids();
       // c1.num2 = 0; // 여기서 0을 넣은게 문제의 원인. 누구나 접근해서 바꿔버릴 수 있다. private를 이용해 Calculator의 데이터를 보호할 수 있다.

        // c1.num1 = 10; num1이 private이라 접근 불가능
        c1.setNum1(10); // setNum1() 메서드는 public이라 접근 가능
        c1.setNum2(10);
        c1.divids();

        System.out.println(c1.gerNum1());

        // 객체 변수는 객체 내의 모든 메서드에 영향을 주므로 외부의 접근 일반적으로 private으로 막는다.
        // 변수에 접근이 필요하면 getter와 setter 메서드를 public 으로 만들어 사용한다.
    }
}
