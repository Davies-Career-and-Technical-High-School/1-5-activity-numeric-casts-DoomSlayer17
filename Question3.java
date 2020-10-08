import java.util.Scanner;

class Question3 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int num1;
      int num2;
      System.out.println("Please input two integers.");
      num1 = scan.nextInt();
      num2 = scan.nextInt();
      double num3 = (double)(num1 + num2)/2;
      System.out.println("The average is " + num3);

        /* Write your code here */

    }
}