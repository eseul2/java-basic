package day6.objectArrayList;

public class Cat {

    String name;
    int age;
    String kind;

    public Cat(String namepram, int ageparam, String kindparam) {
        System.out.println("고양이가 태어납니다.");
        name = namepram;
        age = ageparam;
        kind = kindparam;
    }

    public void meow(){
        System.out.println(age + "살 " + kind +" " + name + "가 야옹하고 웁니다. ");
    }
}
