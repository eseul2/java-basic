package day1;

public class Loop {
    public static void main(String[] args) {

        //반복문

        int count;
        count = 0;
        while (count < 10) {
            System.out.println("반복된 횟수 : " + count);

            count++; // count 값이 1 증가 (숫자형 옆에 ++하면 숫자가 증가)

        }


        int count2 = 0; // 변수를 만듦과 동시에 값 저장
        System.out.println(count2);

        while(count2 < 10) {
            System.out.println("반갑습니다.");
            count2++;
        }

        // for
        //바로 위에꺼랑 같은 원리
        for(int count3 = 0; count3 < 10; count3++) {
            System.out.println("화이팅!");
        }

        for(int i = 1; i <= 100; i++) {
            System.out.println(i);
        }



        //수업 문제

        int num = 1;  // 시작 숫자 설정

        while (num <= 100) {  // 100까지 반복
            if (num % 2 == 0) {  // 짝수인지 확인
                System.out.println(num);  // 짝수인 경우 출력
            }
            num++;  // 다음 숫자로 이동
        }


        int num2 = 1;  // 시작 숫자 설정

        while (num2 <= 100) {  // 100까지 반복
            if (num2 % 2 == 0) {  // 짝수인지 확인
                System.out.println(num2 + " even");  // 짝수인 경우 "even" 추가하여 출력
            } else {  // 홀수인 경우
                System.out.println(num2 + " odd");  // 홀수인 경우 "odd" 추가하여 출력
            }
            num2++;  // 다음 숫자로 이동
        }


        int num3 = 1;

        while(num3 <= 100) {
            if(num2 % 2 == 0) {
                System.out.println(num3 + ":even");
            } else {
                System.out.println(num3 + ":odd");
            }
            num3++;
        }
        //짝수 판별하는 방법 찾아보기


        int time = 74;
        int score = 0;

        // 경기 종료까지 남은 시간 계산
        int remainingTime = 90 - time;

        // 손흥민이 넣을 수 있는 최대 골의 수 (투입 즉시 1골 + 이후 5분마다 추가 골)
        int sonGoals = 1 + (remainingTime - 1) / 5; // 투입하자마자 1골을 넣고, 남은 시간마다 5분마다 추가 골

        // A팀의 최종 득점 계산
        int finalScore = score + sonGoals;

        // 결과 출력
        System.out.println(finalScore);  // 출력: 4




        int a = 12;
        int b = 5;

        // 작은 값과 큰 값을 구분하기 위해
        int start = Math.min(a, b);
        int end = Math.max(a, b);

        // start부터 end까지 출력
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }



    }
}
