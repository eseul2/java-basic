package day8.accessModifer;

public class Test {
    public static void main(String[] args) {

        Person p1 = new Person();
//        p1.id = 20;
        System.out.println(p1.getId(20));

        System.out.println("제 번호는 " + p1.getId(20) + " 입니다.");
        // 출력 : 제 번호는 20 입니다.



    }
    }






    class Person{
        private int id;


        public void setId(int id){
            this.id = id;
        }


        public int getId(int id){
            return id;
        }
    }
