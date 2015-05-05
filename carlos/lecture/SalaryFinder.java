import java.util.Scanner;

public class SalaryFinder {
  public static void main(String[] args)
  {
    double fiftyTwo, seven, fourty, desiredSalary, weeklyPay, dailyPay,
    minutelyPay,grossPay, endingSalary;
    fiftyTwo = 52.00;
    seven = 7.00;
    fourty = 40.00;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter desired YEARLY salary: ");
    desiredSalary = input.nextDouble();
    weeklyPay = (desiredSalary / fiftyTwo);
    dailyPay = (desiredSalary / fiftyTwo / seven);
    minutelyPay = (desiredSalary / fiftyTwo / seven / fourty);
    System.out.printf("You will have to make: $%.2f",weeklyPay);
    System.out.print(" a week!");
    System.out.printf("You will have to make: $%.2f",dailyPay);
    System.out.print(" a day!");
    System.out.printf("You will have to make: $%.2f",minutelyPay);
    System.out.print(" a minute!");
  }
}


//A way to put in an desired amount per how much hourly.
//How many hours you would want to work
//Dollars per hour!
