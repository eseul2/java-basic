package day7.test;

public class Warrior {

    String name;
    int age;
    Bow weapon;




    public void introduce(){
        System.out.println("안녕하세요. 저는 " + age + "살 " + name + "입니다.");
    }


    public void attack(){
        System.out.println(name + "이/가 " + weapon + "로 공격합니다." );
    }

}
