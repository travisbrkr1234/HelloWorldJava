import java.util.Scanner;

public class Chap10Part7 {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    Scanner input1 = new Scanner(System.in);
    /*double bill, tip;
    System.out.print("Enter the amount of your bill: ");
    bill = input.nextDouble();
    tip = tipCalc(bill);
    System.out.println("Your tip should be " + "$" + tip + ".");*/
    double amt, disc;
    System.out.print("Enter the original cost: ");
    amt = input.nextDouble();
    System.out.print("Enter the discount % in whole number form:");
    disc = input1.nextDouble();
    System.out.println("Your total due after discount is " + discount(amt, disc));
  }

  static double discount(double amount, double percent) {
    return (amount - (amount * (percent/100)));
  }

  static double tipCalc(double amount ) {
    return amount * .15;
  }
}
