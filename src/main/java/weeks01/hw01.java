package weeks01;

import java.util.Scanner;

public class hw01 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.print("a를 입력해주세요 : ");
        int a = in.nextInt();

        System.out.print("b를 입력해주세요 : ");
        int b = in.nextInt();

        System.out.print("c를 입력해주세요 : ");
        int c = in.nextInt();

        System.out.print("d를 입력해주세요 : ");
        int d = in.nextInt();

        System.out.print("e를 입력해주세요 : ");
        int e = in.nextInt();

        System.out.print("f를 입력해주세요 : ");
        int f = in.nextInt();

        System.out.print("g를 입력해주세요 : ");
        int g = in.nextInt();

        boolean isOk = true;

        if(a < 5000 || a > 10000) {
            isOk = false;
            System.out.println("a가 잘못되었습니다.");
        }
        if(b < 4000) {
            isOk = false;
            System.out.println("b가 잘못되었습니다.");
        }
        if(b > a) {
            if(c != a + b) {
                isOk = false;
                System.out.println("c가 잘못되었습니다.");
            }
        }else if(b < a) {
            if(c != a + b -300) {
                isOk = false;
                System.out.println("c가 잘못되었습니다.");
            }
        }
        if(d != a+b+c) {
            isOk = false;
            System.out.println("d가 잘못되었습니다.");
        }
        if(e > (a + b + c) * 3) {
            isOk = false;
            System.out.println("e가 잘못되었습니다.");
        }
        if(f < a + b + c + d + e + 5000) {
            System.out.println("f가 잘못되었습니다.");
        }
        if(g != f * 2) {
            System.out.println("g가 잘못되었습니다.");
        }

        if(isOk) {
            System.out.println("모든 조건이 잘못되었습니다.");
        }

    }
}
