package day1;

public class condicionchoose {
    public static void main(String[] args) {

        //택일구조

        // 남녀 (양자택일)

        // 학적 (사자택일)

        // 설적 (오자택일)
        // 컨트롤 알트 엘 누르면 자동으로 코드 줄 맞춰준다

        int age;
        age = 16;

        if (age <= 8) {
            System.out.println("초등");
        } else if (age <= 16) {
            System.out.println("중등");

        } else if (age <= 19) {
            System.out.println("고등");
        } else if (age <= 20) {
            System.out.println("성인");
        }


        //성적출력

        int score;
        score = 55;

        // 점수가 90 ~ 100 : a
        // 점수가 80 ~ 89 : b
        // 점수가 70 ~ 79 : c
        // 점수가 60 ~ 69 : d
        // 점수가 60 미만 : f

        if (score <= 60) {
            System.out.println("f");
        } else if (score <= 70) {
            System.out.println("d");
        } else if (score <= 80) {
            System.out.println("c");
        } else if (score <= 90) {
            System.out.println("b");
        } else {
            System.out.println("a");
        }


        int num;
        num = 1;

        if (num == 1) {
            System.out.println("odd");
        }

        if (num == 2) {
            System.out.println("even");
        }
        if (num == 3) {
            System.out.println("odd");
        }
        if (num == 4) {
            System.out.println("even");
        }




        int age1;
        age1 = 21;

        if(age1 < 19){
            System.out.println("할인대상 입니다.");
        }




    }
}


