package weeks05;

import java.util.Scanner;

public class Hw01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String name1 = "", name2 = "", name3 = "", name4 = "";
        int score1 = 0, score2 = 0, score3 = 0, score4 = 0;

        int i = 1;
        // 4명의 이름과 점수 입력받기
        while (i <= 4) {
            System.out.print(i + "번째 사람 이름 입력: ");
            if (i == 1){
                name1 = in.next();
            } else if (i == 2){
                name2 = in.next();
            }else if (i == 3){
                name3 = in.next();
            } else name4 = in.next();

            System.out.print("받은 점수 입력: ");
            if (i == 1) {
                score1 = in.nextInt();
            }
            else if (i == 2) {
                score2 = in.nextInt();
            } else if (i == 3){
                score3 = in.nextInt();
            } else score4 = in.nextInt();{

            }

            i++;
        }


        while (true) {
            i = 1;
            System.out.println("\n비교할 사람을 선택하세요:");
            while (i <= 4) {
                if (i == 1) System.out.println("1. " + name1);
                else if (i == 2) System.out.println("2. " + name2);
                else if (i == 3) System.out.println("3. " + name3);
                else System.out.println("4. " + name4);
                i++;
            }
            System.out.println("5. 종료");

            System.out.print("첫 번째 사람 입력: ");
            int choice1 = in.nextInt();
            System.out.print("두 번째 사람 입력: ");
            int choice2 = in.nextInt();

            // 종료 조건
            if (choice1 == 5 && choice2 == 5) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 잘못된 입력 처리
            if (choice1 < 1 || choice1 > 4 || choice2 < 1 || choice2 > 4) {
                System.out.println("잘못된 입력입니다!");
                continue;
            }

            // 비교할 사람의 이름과 점수 가져오기
            String p1 = "", p2 = "";
            int firstScore = 0, secondScore = 0;

            if (choice1 == 1) {
                p1 = name1; firstScore = score1;
            } else if (choice1 == 2) {
                p1 = name2; firstScore = score2;
            } else if (choice1 == 3) {
                p1 = name3; firstScore = score3;
            } else {
                p1 = name4; firstScore = score4;
            }

            if (choice2 == 1) {
                p2 = name1; secondScore = score1;
            } else if (choice2 == 2) {
                p2 = name2; secondScore = score2;
            } else if (choice2 == 3) {
                p2 = name3; secondScore = score3;
            } else {
                p2 = name4; secondScore = score4;
            }

            // 점수 비교
            if (firstScore > secondScore) {
                System.out.println("시스템: " + p1 + "의 점수가 " + p2 + "의 점수보다 더 큽니다!");
            } else if (firstScore < secondScore) {
                System.out.println("시스템: " + p2 + "의 점수가 " + p1 + "의 점수보다 더 큽니다!");
            } else {
                System.out.println("시스템: " + p1 + "과(와) " + p2 + "의 점수가 같습니다!");
            }
        }


    }
}