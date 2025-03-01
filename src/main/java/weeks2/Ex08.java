package weeks2;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int price = selectFood(scanner);
        int total = total(scanner, price);

        System.out.println("총 금액은 " + total + "원 입니다.");

    }
    public static int selectFood(Scanner scanner) {
        System.out.println("다음 세 가지 중 고르시오.");
        System.out.println("1. 감자  2. 옥수수  3. 수박");
        int choice = scanner.nextInt();

        if (choice == 1) {
            return selectAmount(scanner, "감자", 1000, 2000, 3000);
        } else if (choice == 2) {
            return selectAmount(scanner, "옥수수", 4000, 5000, 6000);
        } else if (choice == 3) {
            return selectAmount(scanner, "수박", 10000, 20000, 30000);
        } else {
            System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            return selectFood(scanner);
        }
    }

    public static int selectAmount(Scanner scanner, String food, int price1, int price2, int price3) {
        System.out.println(food + "을(를) 선택하셨습니다.");
        System.out.println("1. " + price1 + "원어치  2. " + price2 + "원어치  3. " + price3 + "원어치");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println(food + " " + price1 + "원어치를 선택하셨습니다.");
            return price1;
        } else if (choice == 2) {
            System.out.println(food + " " + price2 + "원어치를 선택하셨습니다.");
            return price2;
        } else if (choice == 3) {
            System.out.println(food + " " + price3 + "원어치를 선택하셨습니다.");
            return price3;
        } else {
            System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            return selectAmount(scanner, food, price1, price2, price3);
        }
    }

    public static int total(Scanner scanner, int price) {
        System.out.println("몇 개를 주문 하시겠습니까?");
        int quantity = scanner.nextInt();
        return price * quantity;
    }

}
