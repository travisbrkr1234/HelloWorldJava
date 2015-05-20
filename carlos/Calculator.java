import java.util.Scanner;

public class Calculator {
  public static void main(String[] args)
  {
    String op;
    double number1, number2;
    Scanner inputOp = new Scanner(System.in);
    Scanner inputNumber = new Scanner(System.in);
    System.out.print("Enter the first number ");
    number1 = inputNumber.nextDouble();
    System.out.print("Enter the second number ");
    number2 = inputNumber.nextDouble();
    System.out.print("Enter one of the operators (/ * - +) and press enter ");
    op = inputOp.next();
    if (op.equals("+"))
          System.out.println(number1 + number2);
    else if (op.equals("-"))
          System.out.println(number1 - number2);
    else if (op.equals("*"))
          System.out.println(number1 * number2);
    else if (op.equals("/"))
          System.out.println(number1 / number2);
    else
          System.out.println("UN-Recognized Operator");
  }
}
