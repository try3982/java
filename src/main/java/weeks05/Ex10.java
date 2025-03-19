package weeks05;

import java.util.Arrays;
import java.util.Scanner;

//ctrl opt L
//BOJ_B1_정정수열_EASY
public class Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        // n= 4
        // [4,1,2,3,4,3,2,1]
        // 1과 1사이,2와 + 사이 *2

        int[] arr = new int[n*2];
        for (int i = 0, len = n * 2; i < len; i++) {


        }

        // 배열 안에 arr[n*2] 길이만큼 값을 넣어주고 싶다.
        // 1부터 n까지* 2번
        // 헷갈리는게 배열에 넣는 값 순서를 어떻게 할지 잘 모르겠음 4,3,2,1,2,3,4?
        // 순서를 정해야 1과 1사이 숫자를 더해서 *1 을하고
        // 2와 2사이 숫자를 더한 후 *2 를 할수 있을거 같음
        // 4까지 위 과정을 진행한후 모든 값을 더해준다.



    }
}
