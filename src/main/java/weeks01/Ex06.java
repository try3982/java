package weeks01;
import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String name1 = in.next();
        String name2 = in.next();
        String name3 = in.next();
        int km = in.nextInt(); // 60
        int km1 = km * 3;



        System.out.println(name1 + "과 " +name2 + "와  " + name3+ "이 있다.");

        System.out.println("셋의 집은 각각 " + km +"마다 떨어져 있는 거리에 존재한다.");
        System.out.println("세 명의 집을 차례대로 방문 하려면 몇km 를 걸어야 한는가");
        System.out.println("답 :");
        int answer = in.nextInt();

        //입력
        if(answer == km1 ) {
            System.out.println("정답입니다.");
        }else {
            System.out.println("오답입니다. \n답은 "+ km1 + "  km입니다.");
        }


//        String  answer1 = "정답입니다.";
//        String answer2 ="오답입니다.";
//
//        if(answer.equals(answer1)) {
//            System.out.println("정답입니다.");
//        }
//        if(answer.equals(answer2)) {
//            System.out.println(" 오답입니다.\n 답은 30km입니다.");
//        }
    }
}
// 코딩테스트
// 자료구조? 알고리즘