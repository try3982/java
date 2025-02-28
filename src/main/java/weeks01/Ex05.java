package weeks01;
import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자 입력 :" );
        int a = sc.nextInt();
        System.out.println("두번째 숫자 입력 :" );
        int b = sc.nextInt();

        if(a < b) {
            System.out.println("b가 a보다 큽니다.");
        }
        if(a >b) {
            System.out.println("a가 b보다 큽니다.");
        }
        if(a ==b) {
            System.out.println("값이 같습니다.");
        }
        if(a !=b) {
            System.out.println("값이 다릅니다.");

        }
        if(a >= b) {
            System.out.println("a가 b보다 크거나 , 둘이 같습니다.");
        }
        if(a<=b) {
            System.out.println("b가 a보다 크거나 둘이 같습니다.");
        }

        // and :동시에 참이어야 한다.
        if(a == 1 && b == 1) {
            System.out.println("a에 1이 들어왔고, b에도 1이 들어왔습니다.(and)");

        }
        // or:  둘중에 하나만 참이어도 참이다 하지만 둘 다 참이어도 실행한다.
        if(a != 1 || b != 1) {
            System.out.println("a에 1이 들어왔거나 혹은 b에 1이 들어있지 않스비다.(or)");
        }

        //  equals()
        // 매우 흔한 패턴이기 때문에 꼭 기억
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "World";

        if(str1.equals(str2)) {
            System.out.println("str1과 str2는 같습니다.");
        }else {
            System.out.println("str1과 str2는 다릅니다.");
        }

        if(str1.equals(str3)) {
            System.out.println("str1과 str3는 같습니다.");
        }else {
            System.out.println("str1과 str3는 다릅니다.");
        }

    }
}
