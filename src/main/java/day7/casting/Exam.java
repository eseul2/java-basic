package day7.casting;

public class Exam {
    public static void main(String[] args) {

        Weapon weapon = new Weapon();
        weapon = new Bow();
        weapon = new Spear();

      weapon.attack();
      weapon.attack();
    }
}
