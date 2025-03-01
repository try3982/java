package week04;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test04 {
    static int a=0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



        int food1 = 2000;
        int food2 = 7000;
        int food3 = 5000;
        int oill = 12000;
        int totalPrice = 0;
        int n=1;

        while(true) {

          System.out.println(n + "번째 손님 선택  :");
          a = in.nextInt();
          n++;


            //1번쨰 손님 선택
            if(a == 1) {

                totalPrice = totalPrice + 2000;
                System.out.println("첫번째 손님이 타코야키르 주문하셔서 현재 누적금액 "+totalPrice +"원입니다.\n");
            }
            //두번째 손님 선택 : 1
            else if(a== 1){
                totalPrice =2000 + food1;
                System.out.println(" 2번째 손님이 타코야키르 주문하셔서 현재 누적금액" + totalPrice +"원입니다.\n");
            }

            else if(a== 5){
                System.out.println("3번째 손님이 종료를 누르셔서 프로그램을 종료합니다.\n");
                break;

            }


        }
        System.out.println("오늘의 매출은 " + totalPrice +"입니다.");





    }
}
