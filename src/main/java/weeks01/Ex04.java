package weeks01;

import java.util.Scanner;


public class Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String chsu = in.next();
        String yh = in.next();
        System.out.println(chsu +"와 " + yh +"는 음식을 준비했습니다.");

        String tmt = in.next();
        String ptt = in.next();
        String juice = in.next();
        System.out.println(chsu +"는 " + tmt + "," + ptt +"," +juice + "를 샀습니다." );

        String rc = in.next();
        String  m= in.next();
        String on = in.next();
        System.out.println(yh + "는" + rc +"," +m +"," +on +"를 샀습니다.");

        int tmtprice = in.nextInt();
        int pttprice = in.nextInt();
        int juiceprice = in.nextInt();
        System.out.println(tmt +"는 " + tmtprice + "원," + pttprice +"원,"
                           + juiceprice + "원입니다.");
        int rcprice = in.nextInt();
        int mprice = in.nextInt();
        int onprice = in.nextInt();
        System.out.println(rc +"는 " + rcprice + "원," + mprice +"원,"
                + onprice + "원입니다.");


        int total = tmtprice +pttprice +juiceprice +rcprice +mprice + onprice ;
        System.out.println("총 합은 " + total +"원이 나왔습니다.");

        int chPay = tmtprice +pttprice +juiceprice;
        System.out.println(chsu +"는 " +chPay +"원 지불하고");

        int yhPay = rcprice +mprice + onprice;
        System.out.println(yh +"는 " + yhPay + "원 지불 했씁니다.");

        System.out.println(yh + "는 " + chsu +"보다 " +  yhPay + chPay +  "원 더 지불했습니다.");

    }
}
