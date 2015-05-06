import java.util.Scanner;

public class Chap9Part9
{
  public static void main(String[] args)
  {
    Scanner inputNum1 = new Scanner(System.in);
    Scanner inputNum2 = new Scanner(System.in);
    Scanner inputOp = new Scanner(System.in);
    double num1, num2;
    String op;
    while(true) {
      System.out.println(" ");
      System.out.print("First number: ");
      num1 = inputNum1.nextDouble();
      System.out.print("Second number: ");
      num2 = inputNum2.nextDouble();
      System.out.print("Operator: ");
      op = inputOp.next();
      if (op.equals("+"))
      System.out.println(num1 + num2);
      else if (op.equals("-"))
      System.out.print(num1 - num2);
      else if (op.equals("*"))
      System.out.print(num1 * num2);
      else if (op.equals("/"))
      System.out.print(num1 / num2);
    }
  }
}
