package day2;

public class DoubleLoop {
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++){
            System.out.println("hi");
        }


        //구구단


//
//        for(int i1 = 1; i1 < 10; i1++){
//                System.out.println("2 * " + i1 + "= " + (2 * i1));
//            }
//
//        for(int i2 = 1; i2 < 10; i2++){
//            System.out.println("3 x " + i2 + "= " + (3 * i2));
//        }




//        int dan = 1;
//        for (int i = 0; i <= 4; i++){
//            System.out.println(i + " x " + i + " = " + (dan +i));
//        }



//        int dan =0;
//        for(int i =1; i <= 9; i++){
//            System.out.println(dan + " x " + i + " = " + (dan * i));
//        }
//
//        for(int dan2 = 2; dan2 < 10; dan2++){
//            for(int i = 1; i <= 9; i++){
//                System.out.println(dan2 + " x " + i + " = " + (dan2 * i));
//            }
//        }
//
//        for (int dan = 2; dan < 10; dan++) {
//            for (int i = 1; i <= 9; i++) {
//                if (i % 2 == 0)
//                    System.out.println(dan + " x " + i + " = " + (dan * i));
//            }
//        }





        for (int n = 2; n < 10; n++) {
            if (n % 2 != 0)
                for (int m = 2; m <= 10; m++) {
                    if (m % 2 == 0)
                        System.out.println(n + " x " + m + " = " + (n * m));
                }
        }





//        for(int num = 0; num < 3; num++) {
//            for (int i = 0; i <= num; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        for(int num2 = 0; num2 < 5; num2++){
//            for(int i1 = 0; i1 <= num2;  i1++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//
//
//        for(int num3 = 0; num3 < 7; num3++){
//            for(int i3 = 0; i3 <= num3; i3++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        int height1 = 7;

        for (int num = 0; num < height1; num++){
            for(int j = 0; j < height1 - num -1; j++){
                System.out.print(" ");
            }
            for(int i = 0; i <= num; i++){
                System.out.print("*");
            }
            System.out.println();
        }


        for (int num = 0; num < 3; num++) {
            for (int i = 0; i <= num; i++) {
                System.out.print("*");
            }
            System.out.println();
        }


        int y = 5;
        int star_len = 0;

        for (int i = 0; i < y; i++) {
            int increase = 0;
            int decrease = 0;

            // y 가 짝수 일 경우
            if (y % 2 == 0) {
                if (y / 2 > i) {
                    increase = 1;
                } else if (y / 2 < i) {
                    decrease = 1;
                }
            }
            // count 가 홀수 일 star_len
            else {
                if (y / 2 >= i) {
                    increase = 1;
                } else {
                    decrease = 1;
                }
            }


            if (increase == 1) {
                star_len++;
            }

            if (decrease == 1) {
                star_len--;
            }

            for (int j = 0; j < star_len; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        }

    }
