package weeks2;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
//        음 세 가지 중 고르시오.
//        1. 감자. 2.옥수수 3. 수박
//        1번을 누를 시
//        1번 감자를 선택하셨습니다. 라는 문구가 나오도록.
//        2번을 누를 시
//        2번 옥수수를 선택하셨습니다.
//        3번을 누를 시,
//                3번 수박을 선택하셨습니다.
//                >>>>>>>>>>>>>>>>>>>>>>>>>>>>
//        그 뒤 1번 감자에서 1000원어치, 2000원어치 3000원어치.
//        2번을 누를 시 옥수수에서 4000원어치, 5000원어치 6000원어치,
//         3번을 누를 시 수박에서 10000원어치, 20000원어치, 30000원어치.
//                라는 문구가 각각 나오도록 설정하고,
//        그 안에서 또 1번을 누를 시
//   “감자 1000어치를 선택하셨습니다.” 라는 문구가 나오도록 하고,
//        몇 개를 주문하겠냐고 질문한 뒤 그 개수에 따라 금액이 변동하도록 하시오.

        //

        int price = 0;

        String p1 = "1000원어치, ";
        String p2 = "2000원어치, ";
        String p3 = "3000원어치\n";
        String c1 = "4000원어치, ";
        String c2 = "5000원어치, ";
        String c3 = "6000원어치\n";

        String w1 = "10000원어치, ";
        String w2 = "20000원어치, ";
        String w3 = "30000원어치\n";

        String f1 = "감자를 선택하셨습니다.\n";
        String f2 = "옥수수를 선택하셨습니다.\n";
        String f3 ="수박을 선택하셨습니다.\n";
        String pr = ">>>>>>>>>>>>\n";

        String print1 = f1 +p1 + p2 + p3 + pr;
        String print2 = f2 +c1 + c2 + c3 + pr;
        String print3 = f3 +c1 + c2 + c3 + pr;


        Scanner in = new Scanner(System.in);
        System.out.println("다음 세가지중 고르시오.");
        System.out.println("1. 감자. 2. 옥수수. 3. 수박");
        int num1 = in.nextInt();
        if (num1 == 1) {
            System.out.println(print1);

            int Innum1 = in.nextInt();
            if (Innum1 == 1) {
                price = 1000;
                System.out.println("감자 1000원어치를 선택하셨습니다.");
            }
            if (Innum1 == 2) {
                price = 2000;
                System.out.println("감자 2000원어치를 선택하셨습니다.");
            }
            if (Innum1 == 3) {
                price = 3000;
                System.out.println("감자 3000원어치를 선택하셨습니다.");

            }

        }

        if (num1 == 2) {
            System.out.println(print2);
            int Innum1 = in.nextInt();
            if (Innum1 == 1) {
                int price2 =4000;
                System.out.println("총 금액은 " + price2 + "원 입니다.");
            }

            if (Innum1 == 2) {
                int price2 =5000;
                System.out.println("총 금액은 " + price2 + "원 입니다.");

            }

            if (Innum1 == 3) {
                int price3 =6000;
                System.out.println("총 금액은 " + price3 + "원 입니다.");

            }
        }
   //

        if (num1 == 3) {
            System.out.println(print3);
        int Innum1 = in.nextInt();
        if (Innum1 == 1) {
           int price4 = 10000;
            System.out.println("총 금액은 " + price4 + "원 입니다.");

        }
        if (Innum1== 2) {
           int price5 = 20000;
            System.out.println("총 금액은 " + price5 + "원 입니다.");

        }

        if (Innum1 == 3) {
            int price6 = 30000;
            System.out.println("총 금액은 " + price6 + "원 입니다.");

        }
    }

        System.out.println("몇개를 주문 하시겠습니까?");
        int orderNum1 = in.nextInt();
        int sum = orderNum1 * price;
        System.out.println("총 금액은 " + sum + "원 입니다.");
    }
}
