import java.util.Scanner;

public class Chap9Part2 {
  public static void main(String[] args)
  {
      double balance, interest;
      System.out.println("What is your starting balance?");
      Scanner input = new Scanner(System.in);
      balance = input.nextDouble();
      double rate = 1.02;
      int year = 1;
      int number = 1;
      while(year <= 10) {
        balance = balance * rate;
          ++year;
      }
          interest = rate * (balance / 1.02);
          System.out.print("After 10 years the balance is: $");
          System.out.printf("%.2f",balance);
          System.out.printf("That is ");
          System.out.printf("%.2f",interest);
          System.out.printf("in interest per year!");
  }
}
