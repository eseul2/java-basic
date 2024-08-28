package methodRetrun;

public class VendingMachine {



    int balance = 0;

    public void deposit(int money){
        balance = balance + money;
        System.out.println("현재 투입된 금액은" + balance + "원 입니다.");
    }

    public void balance(int money){
        System.out.println("현재 잔액은 " + balance + "원 입니다.");

    }

    //콜라 사이다 커피

    public void type (String drink, int price){
        System.out.println( drink + "를 뽑으셨습니다.");
        System.out.println("잔액은 " + balance + "원 입니다.");
    }



}
