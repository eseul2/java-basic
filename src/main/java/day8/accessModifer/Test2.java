package day8.accessModifer;

public class Test2 {
    public static void main(String[] args) {


        Person p1 = new Person();

        System.out.println("제 번호는 " + p1.getId(20) + "입니다.");


    }
}




class Person2 {

    private int id;


    public void setId(int id){
        this.id = id;
    }


    public int getId(int id){
        return id;
    }


}