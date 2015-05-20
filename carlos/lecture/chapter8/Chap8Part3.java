import java.util.Scanner;

public class Chap8Part3 {
  public static void main(String[] args)
  {
    int hoursWorked;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter hours worked: ");
    hoursWorked = input.nextInt();
    double rate = 30.00;
    double grossPay;
    if (hoursWorked > 40) {
    grossPay = (40 * rate) * ((hoursWorked - 40) * (rate * 1.5));
    }
    else {
      grossPay = hoursWorked * rate;
    }
    System.out.printf("The gross pay is = $%.2f",grossPay);
  }
}
