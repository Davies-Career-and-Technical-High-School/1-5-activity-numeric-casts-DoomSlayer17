import java.util.Scanner;

class Question5 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      double num;
      System.out.println("PLease input a decimal number.");
      num = scan.nextDouble();
      double num2 = (num * 10)%10;
      double num3 = (num * 100)%10;
      System.out.println("Here are the digits:");
      System.out.println((int)num2);
      System.out.println((int)num3);


        /* Write your code here */

    }
}