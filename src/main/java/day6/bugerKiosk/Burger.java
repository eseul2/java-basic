package day6.bugerKiosk;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Burger {


    String name;
    int price;



    public Burger(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void select() {
        System.out.println(this.name + "를 고르셨습니다.");


    }
}











