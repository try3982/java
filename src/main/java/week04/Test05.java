package week04;

import java.util.Scanner;

public class Test05 {

    /*    본인이 생각하는 숫자 ?가지를 더하는 프로그램을 개발해보자.
        몇 가지 수를 입력받을 지 알아보자.
        아래 예시의 경우에는, 4개를 입력받은 경우의 수이다.
        몇 개의 숫자를 입력받으시겠습니까? : 4
        처음에 입력받을 숫자 : 1
        두 번째 숫자 : 2
                1[본인이 생각한 숫자] + 2[본인이 생각한 숫자] = 3
        두 번째 숫자 : 5
                3[결과값] + 5[본인이 생각한 숫자] = 8[결과값]
        두 번째 숫자 : 6
                8[결과값] + 6[본인이 생각한 숫자] = 14[결과값]*/
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("몇개의 숫자를 입력받으시겠습니까? : ");
        int n = in.nextInt();

        System.out.print("처음에 입력받을 숫자 : ");
        int m = in.nextInt();
        System.out.print( "두번째 입력받을 숫자 :");
        int n2 = in.nextInt();  // 입력받ㅇ르 숫자
        int answer1 = m + n2;
        System.out.print(m +"[결과값] + " + n2 + "[본인이 생각한 숫자] = " + answer1 +"[결과값]");


        int i = 3;
        while(i < n) {
            int j = 3;
            System.out.println(j + "번째 입력받을 숫자 :");
            int n3  = in.nextInt();
            int answer2 = answer1 + n3;
            n3++;
            System.out.print(answer1 +"[결과값] + " + n3 + "[본인이 생각한 숫자] = " + answer2);

            i++;
        }

    }
}

