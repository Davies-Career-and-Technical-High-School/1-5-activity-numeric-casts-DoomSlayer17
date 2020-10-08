import java.util.Scanner;

class Question1 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int num;
      System.out.println("PLease input a two digit number.");
      num = scan.nextInt();
      int num2 = num/10;
      int num3 = num%10;
      System.out.println("Here are the digits:");
      System.out.println(num2);
      System.out.println(num3);


        /* Write your code here */

    }
}