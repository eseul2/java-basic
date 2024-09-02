package day7.inheritance;
//상속
public class Intheritance {
    public static void main(String[] args) {

        // 상속을 하기 위해선 해당 클래스 옆에 extends 클래스 이름을 적어라.
        // 중복되는 모든 것을 가장 상위 클래스에 적어두면 편해요 (중복을 없애는 방법)
        //캣과 도그는 애니멀의 확장이야
        // 부모에게서 물려받은 이름을 꼭 똑같이 써야한다. 동일한게 있으면 자기 자신의 메서드를 먼저 수행한다.

        // 상속 ->
        // 부모클래스 - 자식 클래스
        // 부모 객체 = 자식 객체

        // 오버라이딩

        // 객체가 가지고 있는 변수, 메서드 () <- 이게 있어야 메서드고 없으면 변수


//        Dog d1 = new Dog();
//        d1.bark();
//        d1.breathe();
//
//        Cat c1 = new Cat();
//        c1.moew();
//        c1.breathe();
//
//        Person p1 = new Person();
//        p1.breathe();


        Duck aDuck = new Duck();
        aDuck.flying();
        aDuck.swim();


        WhiteDuck awhiteDuck = new WhiteDuck();
        awhiteDuck.flying();
        awhiteDuck.swim();


        MallardDuck amallardDuck = new MallardDuck();
        amallardDuck.flying();
        amallardDuck.swim();

        RubberDuck arubberDuck = new RubberDuck();
        arubberDuck.plying();
        arubberDuck.swim();

        Rubber2Duck arubber2Duck = new Rubber2Duck();
        arubber2Duck.plying();
        arubber2Duck.swim();

        AsuraDuck aasuraDuck = new AsuraDuck();
        aasuraDuck.flying();
        aasuraDuck.swim();





        Person p1 = new Person();
        p1.arm = new Arm();  // Arm은 Arm이다. 객체 타입이라 클래스를 따로 만들어서 Person에 넣는다.

        System.out.println(p1.arm.length + "cm");  // 왼쪽이 오른쪽을 가지고 있다.
                                                    // arm 이 length를 가지고 있다.









    }

}
