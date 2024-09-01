package day6.objectArrayList;

public class Warrior {

    String name;
    int attack;
    int defense;



    public Warrior(String nameparam, int attackparam, int defenseparam){
        System.out.println("전사가 태어납니다.");
        name = nameparam;
        attack = attackparam;
        defense = defenseparam;
    }

    public void status(){
        System.out.println();
    }
}
