package weeks07;

import java.util.Scanner;

//1.제품 목록을 보여주고, 선택
//1-1.껌5000원 2.과자7000원 3.복숭아4000 4.환불 5.종료]
// 환불은 전체환불과, 개별 환불 메뉴로
//
//2. 주문할떄마다 주문내역 구매개수, 총 매축액, 고객수 표시
//3. 구매제한 : 껌은 5개까지만 구매 가능

// 종료조건
// 과자의 개수가 10의 배수
// 복숭아 개수 > 과자
// 조건을 만족하지 못하면, 다시 구매할수 있게 할지 알려줘야함

// 종료 후엔는 매출료 출력
// 누가 무엇을 주문하든지, 몇 번째 사람인지, 누적금액이 얼마인지, 해당 음식을 몇 번째 사먹는 것인지 늘 나타

//

public class Ex02 {

    static int total = 0;
    static int cntPeople = 0;
    static int gumCnt = 0;
    static int snackCnt = 0;
    static int peachCnt = 0;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("\n[1.껌 5000원 2.과자 7000원 3.복숭아 4000원 4.환불 5.종료]");
            System.out.print("선택해주세요 : ");
            int choice = in.nextInt();

            if (choice == 1) {
                int gumMax = 5;
                System.out.print("구매 개수 입력 (최대 " + gumMax + "개): ");
                int quantity = in.nextInt();

                if (gumCnt + quantity > gumMax) {
                    System.out.println("껌은 5개 이상 구매할 수 없습니다.");
                } else {
                    buy(quantity, 5000, "껌");
                    gumCnt += quantity;
                }
            } else if (choice == 2) {
                System.out.print("구매 개수 입력 : ");
                int quantity = in.nextInt();
                buy(quantity, 7000, "과자");
                snackCnt += quantity;
            } else if (choice == 3) {
                System.out.print("구매 개수 입력 : ");
                int quantity = in.nextInt();
                buy(quantity, 4000, "복숭아");
                peachCnt += quantity;
            } else if (choice == 4) {
                System.out.println("\n[1. 전체 환불 2. 개별 환불]");
                System.out.print("선택해주세요 : ");
                int refundChoice = in.nextInt();

                if (refundChoice == 1) {
                    refundAll();
                } else if (refundChoice == 2) {
                    refund1(in);
                } else {
                    System.out.println("잘못된 입력입니다.");
                }
            } else if (choice == 5) {
                if (!validateExit()) continue;
                printSales();
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
        in.close();
    }

    public static void buy(int quantity, int price, String item) {
        total += quantity * price;
        cntPeople++;

        System.out.println("***************************************");
        System.out.println(item + "을(를) " + quantity + "개 구매하였습니다.");
        System.out.println("총 주문 고객 수 : " + cntPeople);
        System.out.println("현재까지 누적 매출은 : " + total + "원입니다.");
        System.out.println("***************************************");
    }

    // 전체 환불
    public static void refundAll() {
        total = 0;
        gumCnt = 0;
        snackCnt = 0;
        peachCnt = 0;
        System.out.println("모두 환불되었습니다.");
    }

    // 개별 환불
    public static void refund1(Scanner in) {
        System.out.println("환불할 상품을 선택해주세요 : ");
        int refundChoice = in.nextInt();
        System.out.print("환불할 개수를 입력해 주세요 : ");
        int quantity = in.nextInt();

        if (refundChoice == 1 && gumCnt >= quantity) {
            gumCnt -= quantity;
            total -= quantity * 5000;
        } else if (refundChoice == 2 && snackCnt >= quantity) {
            snackCnt -= quantity;
            total -= quantity * 7000;
        } else if (refundChoice == 3 && peachCnt >= quantity) {
            peachCnt -= quantity;
            total -= quantity * 4000;
        } else {
            System.out.println("잘못된 입력입니다.");
            return;
        }

        System.out.println("환불이 완료되었습니다.");
    }

    // 종료 조건
    public static boolean validateExit() {
        // 1. 과자가 10의 배수가 아닐 경우
        if (snackCnt % 10 != 0) {
            int neededSnack = 10 - (snackCnt % 10);

            if (neededSnack > 0) {
                System.out.println("현재 과자 개수: " + snackCnt + "개");
                System.out.println("과자를 " + neededSnack + "개 더 구매해야 종료할 수 있습니다.");
                return false;
            }
        }

        // 2. 복숭아 개수가 과자보다 적을 경우
        if (peachCnt < snackCnt) {
            int neededPeach = snackCnt - peachCnt;

            if (neededPeach > 0) {
                System.out.println("현재 과자 개수 : " + snackCnt + "개");
                System.out.println("현재 복숭아 개수  : " + peachCnt + "개");
                System.out.println("복숭아를 " + neededPeach + "개 더 구매해야 종료할 수 있습니다.");
                return false;
            }
        }

        return true;
    }

    // 매출 출력
    public static void printSales() {
        System.out.println("===== 매출표 ===== ");
        System.out.println("오늘의 매출: " + total + "원");

        if (gumCnt > 0) System.out.println("껌 : " + gumCnt + "개 " + (gumCnt * 5000) + "원");
        if (snackCnt > 0) System.out.println("과자 : " + snackCnt + "개 " + (snackCnt * 7000) + "원");
        if (peachCnt > 0) System.out.println("복숭아 : " + peachCnt + "개 " + (peachCnt * 4000) + "원");
    }
}
