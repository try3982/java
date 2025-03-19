package weeks05;

public class Test03 {
    // 구구단 2단부터 40단까지 (각 홀수으 단수는 출력 X)
    // 다음 구구단으로 넘어갈때마다 구부선 넣기
    //구구단 4,8,14단은 출력 안되게
    // 구구단 18,20단은 각각 118단 220단으로 출력(20단인 경우 21단도 출력되어야 함)
    //구구단이 10단위  단수가 올라갈 때마다 그 다음 단수가 나올 수 있게 만드시오.

    public static void main(String[] args) {
        for(int dan = 2; dan <= 40; dan++) {
            if(dan % 2 != 0) {
                continue;
            }
            if(dan == 4) continue;
            if(dan == 8) continue;
            if(dan == 14) continue;

            int printDan = dan;
            if(dan == 18) {
                 printDan = 118;
            }else if(dan == 20) {
                printDan = 220;
            }

            System.out.println("=====구구단 " + printDan + "단 ======");
            for(int i=2; i<=9; i++) {
                System.out.println(printDan + " x " + i + " = " + (printDan * i));
            }
            if(dan == 20) {
                System.out.println("=====구구단 " + printDan + "단 ======");
                for(int i=2; i<=9; i++) {
                    System.out.println(21 + " x " + i + " = " + (21 * i));
                }
                continue;
            }
            if(dan % 10 == 0 && dan +1 <=40 ) {
                System.out.println("=====구구단 " + printDan + "단 ======");
                for(int i=2; i<=9; i++) {
                    System.out.println((dan + 1) + " x "  + i + " = " + ((dan+1) * i));
                }

            }

    }

    }
}
