package day7.casting;

public class Casting2 {
    public static void main(String[] args) {


        // 형변환은 유사한 타입에서만 가능.
        // 숫자는 숫자끼리, 객체는 객체끼리 형변환 가능합니다.
        String str = "hihi";
        int num = 10;


        // 객체간의 형변환
        Dog d1 = new Dog();
        d1.bark();


        Cat c1 = new Cat();
        c1.moew();

        // d1 = c1; // Dog 변수에 Cat이 대입될 수 없다. 변수의 대전제

        // 객체간 자동 형변환 (괄호치고 내가 직접 형변환을 하지 않았음) => 안전
        Animal a1 = d1; // Animal 타입 변수에 Dog가 대입되었다.(x). Dog가 Animal로 모습을 바꿔서 대입(o)
        a1 = c1;


        // 객체간의 형변환은 상속 관계에서 허용.
        c1 = (Cat) a1; // Animal을 Cat으로 수동형변환. => 위험.

        // 자식 객체가 부모 객체로 모습을 바꾸는 것은 안전하다. 자식은 부모의 기능을 무조건 가지고 있기 때문에.
        // 부모 객체가 자식 객체로 모습을 바꾸는 것은 위험하다. 부모 객체는 여러 자식 객체에 포함할 수 있기 때문에.
        // 특정 객체로 확신할 수 없다. 일단 모르겠으면 결론부터 외워라. 차차 이해해라.

    }
}


class Animal{

    public void eat(){
        System.out.println("먹다.");
    }

}



class Dog extends Animal {

    public void bark(){
        System.out.println("멍멍");
    }
}





class Cat extends Animal {
    public void moew(){
        System.out.println("야옹");
    }
}
