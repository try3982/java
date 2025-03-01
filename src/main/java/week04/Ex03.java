package week04;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int a=1, b=1, c, d;

        while(true) {
            System.out.println("\n\n다음중 고르시오. 1. 1을 더한다. 2. 종료\n 선택 : ");
            a = in.nextInt();

            if(a == 1) {
                b++;
                System.out.println("b의 현재 숫자 : " + b);
            }
            if(a==2) {
                System.out.println("종료합니다.");
                break;
            }
        }
        System.out.println("\nb는 총 " + b + "라는 숫자가 나왔습니다.");
    }
}
