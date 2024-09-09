package project.teat;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();

        myTset(arr);

        System.out.println(arr.get(0));



    }


    public static void myTset(ArrayList<String> param ) {
        param.add("apple");
        param.add("banana");
        param.add("orange");
    }

}



class Person{



}

//
//
//private void list() {
//    System.out.println("================");
//    for (Post post : posts) {
//        System.out.printf("번호 : %d\n", post.getId());
//        System.out.printf("제목 : %s\n", post.getTitle());
//        System.out.println("================");