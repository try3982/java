package weeks01;

public class Test {
    public static void main(String[] args) {

//        String name = "최윤정";
//        System.out.println("제 이름은 " + name + "입니다.");
//
//        String myString = "나는 " + "Java를 배우고 있다!";
//        System.out.println(myString);
//
//        System.out.println("Hello I'm " + 20 + ".");

        // 음식의 가격을 모두 합치면 얼마?
        int  dbg=  6470000; // 떡볶이
        int  pr = 6988000; // 감자튀김
        int mt = 666777; // 모듬 튀김
        int eggt =  8900000; //계란튀김
        int sundae = 438000;  //순대
        int ud = 660000; //우동
        int cm =    9900;  //카라멜 마끼아도
        int mixcf =999999; //믹스커피
        int bob =  690000; //볶음밥
        int khbob = 5800080;
        int eggbob = 4385000; // 계란 볶음밥
        int drink = 190000; //음표수
        int snack = 150000;

        int total =dbg+pr+mt +eggt+ sundae+ ud + cm + mixcf
                + bob + khbob + eggbob + drink + snack;

        int money = 100000;
        int payMoney = 0;
        //모두 합치면
        System.out.println("음식의 가격을 모두 합치면 " + total + "원입니다.");

        // 현재 ?원이 부족한 상태
        payMoney = total - money;
        System.out.println(payMoney+ "부족합니다.");

        // ? 명은 ?원을 더 내야함
        System.out.println(payMoney / 10 + "원을 더 내야 합니다.");




    }
}
