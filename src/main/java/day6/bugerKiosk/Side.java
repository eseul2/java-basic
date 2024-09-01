package day6.bugerKiosk;

import java.util.ArrayList;

public class Side {


    String name;
    int price;

    public Side(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void select() {
        System.out.println(this.name + "를 고르셨습니다.");
    }
    }


