package day7.composition;

public class Conposition {
    public static void main(String[] args) {


        Kildong dong = new Kildong();
        Kilsoon soon = new Kilsoon();


        soon.java();
        dong.java();
        soon.python();


    }
}


class JavaDeveloper {

    public void java() {
        System.out.println("자바 프로그래밍");
    }
}


class Kildong extends JavaDeveloper {
    public void java() {
        System.out.println("자바 24버전 프로그래밍");
    }

}


class Kilsoon {

    Kildong kildong = new Kildong();

    public void java() {

        kildong.java();
    }

    public void python() {
        System.out.println("파이썬 프로그래밍");
    }
}


class Jinee extends JavaDeveloper {

    public void java() {
        System.out.println("아주 뛰어난 자바 프로그래밍");


//        Kildong dong = new Kildong();
//        Kilsoon soon = new Kilsoon();
//        Jinee nee = new Jinee();
//
//        // 자바는 내가 할게. 대신 넌 파이썬을 해.
//        // 자바가 새로 나올 때마다 두개 다 바꾸기 힘드니까. 대신 파이썬은 니가 해 (효율적이다)
//        dong.java();
//        soon.java(); // 길순아 자바 프로그래밍 해줘
//
//    }
//}
//
//
//class JavaDeveloper{
//    public void java(){
//        System.out.println("자바 프로그래밍");
//    }
//
//}
//
//
//
//class Kildong extends JavaDeveloper{
//    public void java() {
//        System.out.println("자바 22버전 프로그래밍");
//    }
//
//    public void python() {
//        System.out.println("파이썬 프로그래밍");
//    }
//}
//
//
//class Kilsoon {
//
//    Kildong kildong = new Kildong();
//
//    public void java() {
//
//        kildong.java();
//
//        // 길순이가 자바를 사용하려면 길동이한테 연락을 해야 한다.
//        // 길동이 연락처가 필요함.  Kildong kildong = new Kildond();
//    }
//
//    public void python() {
//        System.out.println("파이썬 프로그래밍");
//    }
//}
//
//
//class Jinee extends JavaDeveloper {
//    public void java() {
//        System.out.println("아주 뛰어난 자바 프로그래밍");
    }
}







