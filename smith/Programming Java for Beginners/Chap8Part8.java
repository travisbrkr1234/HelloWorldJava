import java.util.Scanner;

public class Chap8Part8
{
	public static void main(String[] args)
	{
		String op;
		double num1, num2;
		Scanner inputOp = new Scanner(System.in);
		Scanner inputNum = new Scanner(System.in);

		System.out.print("Enter the First number: ");
		num1 = inputNum.nextDouble();
		System.out.print("Enter the second number: ");
		num2 = inputNum.nextDouble();
		System.out.print("Enter the operator: ");
		op = inputOp.next();

		if(op.equals("+"))
		{
			System.out.println(num1 + num2);
		}
		else if(op.equals("-"))
		{
			System.out.println(num1 - num2);
		}
		else if(op.equals("*"))
		{
			System.out.println(num1 * num2);
		}
		else if(op.equals("/"))
		{
			System.out.println(num1 / num2);
		}
		else
		{
			System.out.println("Didn't recongize operator. Valid operators are +, -, *, /");
		}
	}
}