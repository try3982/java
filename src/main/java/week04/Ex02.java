package week04;

public class Ex02 {
    public static void main(String[] args) {
        int a = 13, b=13;

        // 조건이 맞으면 아래 조건은 실행 X
        if(a==1) {
            System.out.println("a에 1이 들어왔습니다.");
        }else if (b==2) {
            System.out.println("b에 2가 들어왔습니다.");
        }else if(b==2) {
            System.out.println("b에 2가 들어있습니다.");
        }
        else if(a == 1) {
            System.out.println("a에 1이 들어있습니다.");
        }else {
            System.out.println("위 조건에 일치하는 조건이 없습니다.");
        }
    }
    // "a에 1이 들어왔습니다.");
    //
}
