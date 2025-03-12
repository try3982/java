package weeks05;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
//       [문제출제 - 사람이 구매할 때마다, 몇 번째 손님이 구매하는 건지 나타내시오. 또한, 현재 누적금액이 얼마인지도 늘 나타내세요.]
//
//        1.장 어덮밥(5000원) 2.옥수수콘(10000원) 3.감자튀김(3000원) 4.총 가격
//        선택할 번호 : 1
//        1번 장어덮밥을 선택하셨습니다.
//                선택할 번호 : 4
//        감사합니다. 총 가격은 5000원입니다.
//                계속 구매하시겠다면 1번, 아니면 2번을 눌러주세요.
//        선택할 번호 : 1
//        계속 진행합니다.
        //for문 연습문제

        Scanner in = new Scanner(System.in);

        int total = 0;
        int customerCnt=0;

        for(;;) {
            customerCnt++;
            int orderAmount = 0;
            System.out.println(customerCnt  +" 번쨰 손님");
              for(;;) {
                  System.out.println("1. 장어 덮밥(5000원) 2.옥수수콘(10000) 3.감자튀김(3000원) 4 총 가격");
                  System.out.print("선택할 번호 : ");
                  int choice = in.nextInt();

                  if(choice == 1) {
                      System.out.println("1번 장어덮밥을 선택하셨습니다.");
                      orderAmount += 5000;
                  }else if(choice == 2) {
                      System.out.println("2번 옥수수콘을 선택하셨습니다.");
                      orderAmount += 10000;
                  }else if(choice == 3) {
                      System.out.println("3번 감자튀김을 선택하셨습니다.");
                      orderAmount += 3000;
                  }else if(choice == 4) {
                      System.out.println("감사합니다. 총 가격은 " + orderAmount + "원입니다.");
                      total  = total + orderAmount;
                      System.out.println("현재까지의 누적 금액 : " + total);
                        break;
                  }else {
                      System.out.println("잘못된 입력입니다. 다시 선택해 주세요.");
                  }
              }
            System.out.println("계속 구매하시겠다면 1번, 아니면 2번을 눌러주세요.");
            System.out.print("선택할 번호 : ");
            int choice1 = in.nextInt();
            if(choice1 == 1) {
                System.out.println("계속 진행합니다.");
            }else if(choice1 == 2) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }else {
                System.out.println("잘못된 입력입니다.다시 입력해주세요.");
            }
        }
    }
}
