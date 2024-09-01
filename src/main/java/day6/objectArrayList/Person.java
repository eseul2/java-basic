package day6.objectArrayList;

public class Person {

    int age;
    String name;


    // 가장 먼저 생성자를 최상위로 올려두는게 좋다

                              // 이게 바로 (매개변수) 까먹지 좀 마...
    public Person(int ageParam, String nameparam) {
        System.out.println("사람이 태어납니다.");
        // this.age = age; => this는 메서드를 수행하는 객체를 의미한다.
        // 맨 위에 있는 객체를 말하는 거임. 그래서 매개변수와 객체의 이름이 같더라도
        // 객체에게 this.를 붙여주면 됨.
        name = nameparam;
        age = ageParam;
    }

    public void introduce() {
        System.out.println("안녕하세요" + age + "살 " + name + "입니다.");


        // 이렇게 시용할 수도 있더 . 편한대로 사용하세요
        System.out.printf("안녕하세요 %d살 %s입니다\n", age, name);
        // d가 인트고 s가 스트링인가..? \n 줄바꿈
    }

}
