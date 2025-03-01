package week04;

public class Ex01 {
    public static void main(String[] args) {

       int a = 1;
       while (a <= 100) {
           System.out.println("test a : " + a);
           a++;
       }
//        읽어 내려갈 때 마지막에 더해진 값은 a++(a를 1씩 더하라.)을 통해 마지막에 101이
//                되었지만
//        while문은 조건이 true일 때만 실행하다보니 101은 받지 않아서, 결국 출력까진 되지 못하고
//        종료가 된 셈
        System.out.println("test a : " + a); // 101?
    }
}
