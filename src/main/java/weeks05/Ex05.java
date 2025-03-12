package weeks05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
//        [문제출제 - 사람이 구매할 때마다, 몇 번째 손님이 구매하는 건지 나타내시오.
//        또한, 현재 누적금액이 얼마인지도 늘 나타내세요.]
//
//        1.장 어덮밥(5000원) 2.옥수수콘(10000원) 3.감자튀김(3000원) 4.총 가격
//        선택할 번호 : 1
//        1번 장어덮밥을 선택하셨습니다.
//                선택할 번호 : 4
//        감사합니다. 총 가격은 5000원입니다.
//                계속 구매하시겠다면 1번, 아니면 2번을 눌러주세요.
//        선택할 번호 : 1
//        계속 진행합니다.

        Scanner in= new Scanner(System.in);
        int total = 0;
        int personCount=1;

        for(;;) {
            System.out.println(personCount + "번째 손님");
            System.out.println("현재 누적금액 : " + total);
            System.out.println("1. 장어덮밥(5000원) 2.옥수수콘(10000원) 3.감자튀김(3000원) 4.총 가격 ");
            int choice = in.nextInt();

            if(choice == 1) {
                System.out.println("장어덮밥을 선택하셨습니다.");
                total += 5000;
                }else if(choice == 2) {
                    System.out.println("옥수수콘을 선택하셨습니다.");
                total += 10000;
                }else if(choice == 3) {
                    System.out.println("감자취김을 선택하셨습니다.");
                total += 3000;
                }else if(choice == 4) {
                    System.out.println("총 가격은 " + total + "원입니다.");
                    System.out.println("계속 구매하시겠다면 1번, 아니면 2번을 눌러주세요.");
                        int continueChoice = in.nextInt();

                    if(continueChoice == 1) {
                    System.out.println("계속 진행합니다.");
                    personCount++;

                        }else if(continueChoice == 2) {
                            System.out.println("종료합니다.");
                            break;
                        }else {
                            System.out.println("잘못된 입력입니다.");
                }
            }else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
