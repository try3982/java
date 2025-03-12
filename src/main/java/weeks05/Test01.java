package weeks05;

import java.util.Scanner;

public class Test01 {
    static boolean bool= true;
    static int total =0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while(true) {

            System.out.println("[1.구구단 2.음식점] 3.계산기 4.종료");
            int choice = in.nextInt();

            if(choice == 1) {
                gugudan();
            }else if(choice == 2) {
                restaurant(in);
            }else if(choice == 3) {
                    calculator(in);
            }else if(choice == 4) {
                System.out.println("총 합산 금액은 " + total +"원입니다.");
                System.out.println("프로그램 종료");
            }else {
                System.out.println("잘못된 입력입니다.");
            }

        }

    }
    public static void gugudan() {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("구구단 2단");
            int dan=2;
            int i=1;
            while(i <=9) {
                System.out.println(dan + " * " + i + " = " + (dan *i));
                i++;
            }
            System.out.print("[1.구구단 2.음식점] 3.계산기 4.종료");
            int choice = in.nextInt();

            if(choice == 2) {
                break;
            }

        }

    }
    public static void restaurant(Scanner in) {
         if(bool) {
             System.out.print("음식가격을 입력해주세요  :");
             System.out.print("볶음밥 가격 : ");
             int food1 = in.nextInt();

             System.out.print("자장면 가격 : ");
             int food2 = in.nextInt();

             System.out.println("탕수육 (소) : ");
             int food3Small = in.nextInt();
             System.out.println("탕수육 (중) : ");
             int food3Medium = in.nextInt();
             System.out.println("탕수육 (대) : ");
             int food3Large = in.nextInt();


             System.out.println("1.볶음밥 " + food1 + " 2.짜장면 "  + food2 + " 3.탕수육(소) " + food3Small + "탕수육 (중)" +food3Medium + "탕수육 (대) " +food3Large);
             bool = false;
        }

         while(true) {
             System.out.println("1.볶음밥 2.자장면,3.탕수육 4. 종료");
             System.out.print("선택 : ");
             int choice = in.nextInt();
             if(choice == 1) {
                 total += 5000;
                 System.out.println("볶음밥 5000원");
             }else if(choice == 2) {
                 total += 6000;
                 System.out.println("자장면 6000원");
             }else if(choice == 3) {
                 total += 8000;
                 orderTangSuYuk(in);
             }else if(choice == 4) {
                 break;
             }else {
                 System.out.println("잘못된 입력입니다.");
             }
         }
    }
    public static void orderTangSuYuk(Scanner in) {
        while(true) {
            System.out.println("1. 대[15000원] 2. 중[12000원] 3. 소[8000원] 4. 이전메뉴");
            int choice = in.nextInt();
            if(choice == 1) {
                total += 15000;
                System.out.println("탕수육 대 15000원이 추가되어 현재 금액 :" + total +"원입니다.");
            }else if(choice == 2) {
                total += 12000;
                System.out.println("탕수육 중 12000원이 추가되어 현재 금액 :" + total +"원입니다.");
            }else if(choice == 3) {
                total +=8000;
                System.out.println("탕수육 th 15000원이 추가되어 현재 금액 :" + total +"원입니다.");
            }else if(choice == 4) {
                break;
            }else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
    public static void calculator(Scanner in) {
        int result = 0;

        while(true) {
            System.out.println("계산기입니다.");
            System.out.println("계산된 금액 : " + result);
            System.out.println("1. 더하기 2.빼기");
            System.out.print("선택 : ");
            int choice  = in.nextInt();

            if(choice == 1) {
                System.out.print("첫 번째 숫자 :");
                int num1 = in.nextInt();
                System.out.print("두 번째 숫자 :");
                int num2 = in.nextInt();
                result = num1 + num2;
                System.out.println(num1 + " + " +num2 + " = " + result);
            }else if(choice == 2) {
                System.out.print("첫 번째 숫자 :");
                int num1 = in.nextInt();
                int num2;

                while(true) {
                    System.out.print("두번째 숫자 :");
                     num2 = in.nextInt();
                    if(num1 < num2) {
                        System.out.println("두 번째 숫자가 더 클 수 없습니다.");
                    }else {
                        break;
                    }
                }

                result = num1 - num2;
                System.out.println(num1 + " - " +num2 + " = " + result);
            }else if(choice == 3) {
                break;
            }else {
                System.out.println("잘못된 입력입니다.");
            }

        }
    }



}
