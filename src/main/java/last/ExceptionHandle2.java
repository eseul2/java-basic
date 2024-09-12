package last;

public class ExceptionHandle2 {
    public static void main(String[] args) {

        test(1);
    }


    // 예외를 직접 발생시키기 -> 테스트 용도 / 어떤 상황에서는 프로그램이 진행되는 것보다 강제로 종료시키고 바로 고치는 게 나을 수 있다.
    public static void test(int flag){

        if (flag == 1) {
            try {
                throw new Exception(); // uphandle exception, checked exception => 얘는 무조건 try = catch 예외처리로 해야함
            } catch (Exception e) {

            }

        }else if(flag == 2) {
            throw new RuntimeException(); // runtime exception, upchexked exception => try 예외처리 안해도 됨
        }


         System.out.println("hihi");
    }

}
