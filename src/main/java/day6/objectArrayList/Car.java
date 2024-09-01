package day6.objectArrayList;

public class Car {

    String model;
    String color;
    int speed;


    public Car(String modelparam, String colorparam, int speedparam){
        System.out.println("자동차가 만들어집니다.");
        model = modelparam;
        color = colorparam;
        speed = speedparam;

    }

    public void drive(){
        System.out.println(color + model + "이/가" + speed + "km로 달립니다.");

    }
}
