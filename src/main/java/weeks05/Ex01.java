package weeks05;

public class Ex01 {
    public static void main(String[] args) {


//        중요문제
//        기본적으로 0의 숫자를 가지고 있는 f가 있다.
//        f는 10씩 증가하며, 총 1000까지만 늘어난다
//        그 다음, f가 500까지 다시 10씩 떨어지는 상황을
//        출력하시오.

        int f = 0;
        int count = 0;

        while (true) {
            if (count == 0) {
                f += 10;
                System.out.println(f);
                if(f==1000) {
                   count++;
                }
            }
            if (count != 0) {
                f -= 10;
                System.out.println(f);
                if(f == 500){
                    break;
                    //
                }
            }

        }
    }
}
