package weeks01;

public class Ex02 {
    public static void main(String[] args) {
        boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        int myInt = 123;
        long myLong = 12345678910L;

        System.out.println("숫자 연산자");
        int a =9;
        double b = 5;
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a  /b));
        System.out.println(a + " % " + b + " = " + (a % b));

        System.out.println("비교 연산자");
        System.out.println(3 + " >" + 2 + ":" + (3 >2));
        System.out.println(3 + " <" + 2 + ":" + (3 <2));
        System.out.println(3 + " >=" + 2 + ":" + (3 >=2));
        System.out.println(3 + " <=" + 2 + ":" + (3 <=2));
        System.out.println(3 + " ==" + 2 + ":" + (3 ==2));
        System.out.println(3 + " !=" + 2 + ":" + (3 !=2));


        System.out.println("불린 연산자 - and");
        System.out.println("true && true :" + (true && true));
        System.out.println("true && false :" + (true && false));
        System.out.println("false && true :" + (false && true));
        System.out.println("false && false :" + (false && false));


        System.out.println("불린 연산자 - or");
        System.out.println("true || true :" + (true ||true));
        System.out.println("true || false :" + (true ||false));
        System.out.println("true || true :" + (false ||true));
        System.out.println("true || true :" + (false ||false));

        System.out.println("불린 연산자  - not");
        System.out.println("!true : " + !true);
        System.out.println("!false "  + !false);

        double x = 3.14;
        int y = (int) x;
        System.out.println(y);


    }
}
