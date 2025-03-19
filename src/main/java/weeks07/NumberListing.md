
public class NumberListing {
public static void main(String[] args) {
int b = 1;
int c = 1;

        System.out.println("\n\n지금부터 1부터 100까지의 숫자를 나열합니다.\n\n");
        for (int i = 1; i <= 100; i++) {
            System.out.println("===================================");
            System.out.println("\n증감되는 i의 숫자 = " + i);
            System.out.println("\n증감되지 않는 b의 숫자 = " + b);
            System.out.println("\n함께 증감하는 c의 숫자 = " + c);
            System.out.println("===================================");
            c++;
        }
    }
}


1. i가 100까지 증가하게 만드세요. 그 뒤 b가 i보다 50이 높게 증가하게 해주세요. 그 뒤 c가 b의 두배까지 증가하게 해주세요.
2. c의 증가가 멈추면 다시 -500까지 떨어집니다. 그 뒤 i와 b가 동시에 -500까지 떨어지게 되고,
   i와 b와 c가 일치했을 때 i가 3000까지 먼저 증가하게 됩니다. i가 증가하던 중 i가 1500이 되었을 떄,
   b가 증가하기 시작하며, b의 숫자가 i보다 1000이 더 크기 시작할 때 c가 증가하게 되고, b는 5000에서 멈춥니다.
   b가 5000까지 증가했을 때 i와 c가 b까지만 증가하게 하고 프로그램이 종료됩니다.

