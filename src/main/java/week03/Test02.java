package week03;



import java.util.Scanner;

public class Test02 {

    static Scanner in = new Scanner(System.in);
    static int money = 10000; // 초기 금액
    static boolean addMoneyStatus = false; // 추가 용돈 상태

    public static void main(String[] args) {
        money(); // 현재 금액 출력
        addMoney(); // 추가 용돈 입력
        orderFood(); // 음식 주문 처리
        finalMoney(); // 최종 잔액 출력
    }

    // 현재 잔액 표시
    public static void money() {
        System.out.println("현재 금액 " + money + "원입니다.");
    }

    // 추가 용돈 입력
    public static void addMoney() {
        System.out.println("추가로 받을 용돈을 입력해주세요 :");
        int addMoney = in.nextInt();
        money += addMoney;
        money();
    }

    // 음식 주문 진행
    public static void orderFood() {
        int food1 = foodPrice("떡볶이");
        int food2 = foodPrice("우동");
        int food3 = foodPrice("과자");

        orderFoodLogic("떡볶이", food1);
        orderFoodLogic("우동", food2);
        orderFoodLogic("과자", food3);
    }

    // 음식 가격 입력
    public static int foodPrice(String foodName) {
        System.out.println(foodName + " 가격을 입력해주세요 : ");
        return in.nextInt();
    }

    // 음식 주문처리 로직
    public static void orderFoodLogic(String foodName, int price) {
        System.out.print(foodName + "을(를) 몇 개 주문하시겠습니까? ");
        int amount = in.nextInt();
        int totalPrice = price * amount;

        if (checkBalance(totalPrice)) {
            pay(totalPrice, foodName);
        } else {
            minusMoney(totalPrice, foodName);
        }
    }

    // 잔액이 부족한지 확인
    public static boolean checkBalance(int price) {
        return money >= price;
    }

    // 결제 처리
    public static void pay(int price, String foodName) {
        money -= price;
        System.out.println(foodName + "을(를) 주문하였습니다.");
        money();
    }

    // 돈이 부족할 때 결제 로직
    public static void minusMoney(int price, String foodName) {
        int minusMoney = price - money;
        System.out.println(minusMoney + "원이 부족합니다.");

        // 떡볶이 주문 시 한 번만 추가 용돈 가능
        if (foodName.equals("떡볶이") && !addMoneyStatus) {
            addMoney(); // 추가 용돈 입력
            addMoneyStatus = true; // 한 번만 받을 수 있도록 설정

            // 추가 용돈 후 결제 가능하면 진행
            if (checkBalance(price)) {
                pay(price, foodName);
                return;
            }
        }

        // 추가 용돈을 받았거나 돈이 여전히 부족하면 가게에서 쫓겨남
        exitShop();
    }

    // 최종 잔액 출력
    public static void finalMoney() {
        System.out.println("최종 잔액: " + money + "원");
    }

    // 돈이 부족하면 가게에서 쫓겨남
    public static void exitShop() {
        System.out.println("돈이 없네요? 나가주세요.");
    }
}