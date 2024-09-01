package day6.bugerKiosk;

import java.util.ArrayList;

public class Drink {


    String name;
    int price;

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void select() {
        System.out.println(this.name + "를 고르셨습니다.");
    }

    }

