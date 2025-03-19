package weeks07;

public class NumberListing{
    public static void main(String[] args) {

        // i 100까지 증가
        System.out.println("\n\n지금부터 1부터 100까지의 숫자를 나열합니다.\n\n");
        for (int i = 1, b=1, c=1; i <= 100; i++) {
            System.out.println("===================================");
            System.out.println("\n증감되는 i의 숫자 = " + i);
            System.out.println("\n증감되지 않는 b의 숫자 = " + b);
            System.out.println("\n함께 증감하는 c의 숫자 = " + c);
            System.out.println("===================================");
            c++;
        }

        //b가 i보다 50 높게 증가
      for(int b=101, i= 100,c=101; b <= i+50; b++) {
          System.out.println("===================================");
          System.out.println("\n증감되는 i의 숫자 = " + i);
          System.out.println("\n증감되지 않는 b의 숫자 = " + b);
          System.out.println("\n함께 증감하는 c의 숫자 = " + c);
          System.out.println("===================================");
          c++;
      }

      // c가 b의 두배까지 증가
      for(int c= 151, b=150, i=100; c <= b*2;) {
          System.out.println("===================================");
          System.out.println("\n증감되는 i의 숫자 = " + i);
          System.out.println("\n증감되지 않는 b의 숫자 = " + b);
          System.out.println("\n함께 증감하는 c의 숫자 = " + c);
          System.out.println("===================================");
          c++;
      }
      //-500까지 감소
      for(int c=300, i=100, b=150; c >= -500; ) {
          System.out.println("===================================");
          System.out.println("\n증감되는 i의 숫자 = " + i);
          System.out.println("\n증감되지 않는 b의 숫자 = " + b);
          System.out.println("\n함께 증감하는 c의 숫자 = " + c);
          System.out.println("===================================");
          c--;

      }
      //i와 b가 동시에 -500까지 감소
     for(int i=100, b= 150,c=-500; i>=-500; i--, b--) {
         System.out.println("===================================");
         System.out.println("\n증감되는 i의 숫자 = " + i);
         System.out.println("\n증감되지 않는 b의 숫자 = " + b);
         System.out.println("\n함께 증감하는 c의 숫자 = " + c);
         System.out.println("===================================");

     }
     // i와 b와 c가 일치하면 i가 3000까지 증가.
     for(int i=-500, b= -500, c = -500; i<=3000; i++) {
         System.out.println("===================================");
         System.out.println("\n증감되는 i의 숫자 = " + i);
         System.out.println("\n증감되지 않는 b의 숫자 = " + b);
         System.out.println("\n함께 증감하는 c의 숫자 = " + c);
         System.out.println("===================================");

         //i가 1500이 되면 b증가 시작
         if(i==1500) {
             for(b= 1500; b<= i+1000; b++) {
                 System.out.println("===================================");
                 System.out.println("\n증감되는 i의 숫자 = " + i);
                 System.out.println("\n증감되지 않는 b의 숫자 = " + b);
                 System.out.println("\n함께 증감하는 c의 숫자 = " + c);
                 System.out.println("===================================");

                 //b > i+ 1000이면 c 증가
                 if(b >= i+1000) {
                     for(c=2500; c <= b; c++) {
                         System.out.println("===================================");
                         System.out.println("\n증감되는 i의 숫자 = " + i);
                         System.out.println("\n증감되지 않는 b의 숫자 = " + b);
                         System.out.println("\n함께 증감하는 c의 숫자 = " + c);
                         System.out.println("===================================");
                     }
                 }

             }
         }
     }
     // 5000까지 b 증가.
    for(int b= 2500, i=3000,c=3000; b<= 5000; b++) {
        System.out.println("===================================");
        System.out.println("\n증감되는 i의 숫자 = " + i);
        System.out.println("\n증감되지 않는 b의 숫자 = " + b);
        System.out.println("\n함께 증감하는 c의 숫자 = " + c);
        System.out.println("===================================");
    }

    // i와 c가 b까지만 증가
    for(int i=3000, c= 3000, b= 5000; i <=b && c <=b; i++, c++) {
        System.out.println("===================================");
        System.out.println("\n증감되는 i의 숫자 = " + i);
        System.out.println("\n증감되지 않는 b의 숫자 = " + b);
        System.out.println("\n함께 증감하는 c의 숫자 = " + c);
        System.out.println("===================================");
    }

        System.out.println("\n 프로그램을 종료합니다.");

    }
}
