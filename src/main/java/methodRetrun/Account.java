package methodRetrun;

public class Account {

//    int remainder = 0;
//
//
//    public void deposit(int money){
//        remainder = remainder + money;
//        System.out.println(money + "을 입력했습니다.");
//    }
//
//    public int withdraw(int money){
//        remainder =remainder - money;
//        return money;
//    }
//
//    public int getRemainder(){
//        return remainder;
//    }


    int remainder = 0;


    public void deposit(int money) {
        remainder= remainder + money; // 돈을 모아둘 변수를 하나 만들기
        System.out.println(money + "를 입금했습니다.");
    }

    public int withdraw(int money) {
        return remainder = remainder - money;
    }


    public int getRemainder() {
        return remainder;
    }
}


