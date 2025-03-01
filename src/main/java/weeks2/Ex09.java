package weeks2;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
//        학점과 점수를 입력받고, 해당 학점과 점수가 정상적인지 알아내는 프로그램을 만들어보시오.
//        점수 : 100
//        학점 : A
//        올바른 학점입니다. or 올바르지 않은 학점입니다.
//
//        같이 나타나게 한다. 무조건 점수를 먼저 입력받는다.
//
//        A >> 점 100이상
//        B >> 점 90이상
//        C >> 점 80이상
//        D >> 점 70이상
//        E >> 점 60이상
//        F >> 점 50이상
        Scanner scanner = new Scanner(System.in);
        System.out.println("학접 입력 :");
        int score = score(scanner);

    }

    public static int score(Scanner scanner) {
        int score = scanner.nextInt();
        char grade;

        if (score >= 100) {
            System.out.println("올바른 학점입니다.");
            System.out.println("점수 : " +score);
            System.out.println("학점 :A");
            return grade = 'A';
        } else if (score >= 90) {
            System.out.println("올바른 학점입니다.");
            System.out.println("점수 : " +score);
            System.out.println("학점 :B");
            return grade = 'B';
        } else if (score >= 80) {
            System.out.println("올바른 학점입니다.");
            System.out.println("점수 : " +score);
            System.out.println("학점 :C");
            return grade = 'C';
        } else if (score >= 70) {
            System.out.println("올바른 학점입니다.");
            System.out.println("점수 : " +score);
            System.out.println("학점 :D");
            return grade = 'D';
        } else if (score >= 60) {
            System.out.println("올바른 학점입니다.");
            System.out.println("점수 : " +score);
            System.out.println("학점 :E");
            return grade = 'E';
        } else if(score >= 50) {
            System.out.println("올바른 학점입니다.");
            System.out.println("점수 : " +score);
            System.out.println("학점 :F");
            return grade = 'F';
        }else{
            System.out.println("올바르지 않은 학점입니다.");
            return score(scanner);
        }
    }



}



