package day8.staticExam;

public class Test {
    public static void main(String[] args) {

        Person2 p2 =new Person2();

        p2.name = "홍길동";
        p2.age = 22;

        p2.introduce();

        Person2 p3 =new Person2();
        p3.name = "홍길순";
        p3.age = 25;

        p3.introduce();
        p2.introduce();


    }
}









