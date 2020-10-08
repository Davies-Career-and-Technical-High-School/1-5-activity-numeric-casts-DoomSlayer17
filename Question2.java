import java.util.Scanner;

class Question2 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int num;
      System.out.println("PLease input a three digit number.");
      num = scan.nextInt();
      int num2 = num/100;
      int num3 = num%100;
      int num4 = num3/10;
       int num5 = num%10;
      System.out.println("Here are the digits:");
      System.out.println(num2);
      System.out.println(num4);
      System.out.println(num5);


        /* Write your code here */

    }
}