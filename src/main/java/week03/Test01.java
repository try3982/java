package week03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        // 둘이 가진 금액은 애초에 10000원으로,

        int elemoney = 10000;
        int money = 10000;
        System.out.println("애초금액 " + elemoney +"원");
        //   처음에 용돈을 추가적으로 입력받는다.
        System.out.println("용돈 받을 금액을 입력해주세요 :");
        Scanner scanner = new Scanner(System.in);
        int adddMoeny = scanner.nextInt();
        // 추가적으로 입력받으면, 현재 금액이 얼마인지 바로 나타내준 후,
         money = elemoney + adddMoeny;
        System.out.println("현재 금액은  " +money+ " 원입니다.");
        //   바로 떡볶이 금액, 우동 금액, 과자 금액을 입력받는다.
        System.out.println("떡볶이 금액을 입력해주세요 :");
        int food1 = scanner.nextInt();

        //   그리고
        //   바로 떡볶이를 몇 개를 주문하겠냐는 메시지가 나타난다.
        //   이곳에서 20개를 입력하게 되면 10000원밖에 없기 때문에 10000원이 부족해진다.
        System.out.println("떡볶이를 몇개 주문하시겠습니까?");
        int amount = scanner.nextInt();
        int totalprice = food1 * amount;

        if(totalprice > money) {
            // 총금액 구하기 -> 음식가격 * 수량
            int total = food1 * amount;
            int minusMoney = money  - total;
            System.out.println(minusMoney  + "원이 부족합니다.");
            System.out.println("추가로 받을 용돈을 입력해주세요 : ");
            int addMoney =  scanner.nextInt();
            // 가적으로 용돈을 받은 경우에는 얼마를 입력받아서 얼마가 되었다. 라는 형식으로 나타내면 되고,
          int addMoney3 =   money + addMoney;
            System.out.println(addMoney + "원을 받아서 " + addMoney3 +"원이 되었습니다.");
           // 그곳에서 돈이 부족하지 않은 경우에는 떡볶이는 얼마였고, 현재 얼마가 남았다는 문장과 함께
            //   다음 떡볶이 > 우동 > 과자로 넘어가게 된다.
            if(total < addMoney3) {
               money  = addMoney3 - total;
                System.out.println("떡볶이는 " + total +"원이었고 현재 " + money + "원 남았습니다.");
            }
            ////        돈이 부족하지 않을 경우에는 떡볶이는 얼마였고, 현재 얼마가 남았다는 문장과 함께
        }else {

        }
       // 바로 떡볶이 > 우동 > 과자로
        // 우동
      //  만약 떡볶이에서 돈이 부족하지 않았다면, 우동에서 부족했을 경우, 용돈을 받고 과자에서도 부족하다면 과자에서 쫓겨났을 것이고,
        //   만약 돈이 아예 부족하지 않을 만큼 많이 받은 경우에는 셋 다 사먹어도 무난하게 마지막 금액이 나타났을 수 있다.
        //   즉, 상황에 따라 변화하는 알고리즘을 작성하시오.



        //만약 떡볶이에서 돈이 부족하지 않았다면, 우동에서 부족했을 경우, 용돈을 받고 과자에서도 부족하다면 과자에서 쫓겨났을 것이고,
        //        //   만약 돈이 아예 부족하지 않을 만큼 많이 받은 경우에는 셋 다 사먹어도 무난하게 마지막 금액이 나타났을 수 있다.

        //떡볶이에서 남은 금액을 넘겨 받아야 함
        System.out.println("우동 금액을 입력해주세요 :");
        int food2 = scanner.nextInt();
        System.out.println("우동을 몇개 주문하시겠습니까?");
        int amount2 = scanner.nextInt();
        int total  = food2 * amount2;


//        System.out.println( "total : " + total);
//        System.out.println("money" + money);
        //
        if(total > money ) {
            int minusMoney2 = money - total;
            System.out.println(minusMoney2 + "원이 부족합니다.");
            System.out.println("용돈 받을 급액을 입력해주세요 : ");
            int addMoney =  scanner.nextInt();
            money =   money + addMoney;
            System.out.println(addMoney +"원을 받아서  현재 " + money +"원이 되었습니다.");
        }else {
            System.out.println(money + "원 남았습니다.");
        }

       // 이후 우동이나 과자에서 돈이 부족한 경우 주인장에게 쫓겨나게 만드시오.

        System.out.println("과자 금액을 입력해주세요 :");
        int food3 = scanner.nextInt();

        int total3 = food3 * amount;
        money = money - total3;
        System.out.println();

        if(total3 > money ) {
            int minusMoney2 = money - total;
            System.out.println(minusMoney2 + "원이 부족합니다.");
            System.out.println("용돈 받을 급액을 입력해주세요 : ");
            int addMoney =  scanner.nextInt();
            int addMoney3 =   money + addMoney;
            System.out.println(addMoney +"원을 받아서  현재 " + money +"원이 되었습니다.");

        }else {
            System.out.println(money + "원 남았습니다.");
        }


    }



}
