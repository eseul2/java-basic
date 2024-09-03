package day7.test;

public class Exam {
    public static void main(String[] args) {


        Warrior warrior = new Warrior();

        warrior.age = 20;
        warrior.weapon = new Bow();
        warrior.weapon = new Sword();

    }
}




class Weapon {

}




class Warrior {

    int age;
    Weapon weapon;


}




class Bow extends Weapon {

    public Bow(){
        System.out.println("활");
    }

}




class Sword extends Weapon {

    public Sword(){
        System.out.println("칼");
    }


}



