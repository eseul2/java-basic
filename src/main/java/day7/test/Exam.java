package day7.test;

public class Exam {
    public static void main(String[] args) {

        Warrior warrior = new Warrior();
        warrior.name = "홍길동";
        warrior.age = 20;


        warrior.introduce();

        warrior.weapon = new Bow();
        warrior.attack();

//        warrior.weapon = new Sword();
//        warrior.attack();






    }
}
