package weeks01;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        // 입력 :10과 20
        //그렇게 하면 아래처럼 나타난다.
        //   10 + 20 =


        Scanner sc = new Scanner(System.in);

        int  a = sc.nextInt();
        int  b = sc.nextInt();
        System.out.print(a + " + " + b + " = ");
        int youranswer = sc.nextInt();
        int answer = a +b;

        int max;

        if( youranswer == answer ) {
            System.out.println("정답입니다.");
            System.out.println("둘중 어느 숫자가 더 큽니까?");
            int maxNum = sc.nextInt();
            if(a < b) {
                  max = b;
            }else {
                  max = a;
            }
            if(maxNum == max) {
                System.out.println("정답입니다. ");
            }else {
                System.out.println("오답입니다.정답은 " + max+ "입니다." );
            }

        }else {
            System.out.println("오답입니다.  답은 " + answer + "입니다.");
        }




    }
}
