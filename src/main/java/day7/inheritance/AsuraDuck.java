package day7.inheritance;

public class AsuraDuck extends RubberDuck{


    // 상속의 한계.
    // 객체가 많아지고 상속 관계가 복잡해질 수록 중복 해결이 어려워진다.
    // 아수라 최최종 a와 b의 객체를 가진 c를 만들어야 할 때 효율적으로 해결하기 어렵다.
    //
    public void swim(){
        System.out.println("오리가 둥둥 떠다닙니다.");
    }
}
