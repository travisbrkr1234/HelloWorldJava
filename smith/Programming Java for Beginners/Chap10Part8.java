import java.util.Scanner;

public class Chap10Part8
{
	public static void main(String[] args)
	{
		Scanner inputNum1 = new Scanner(System.in);
		Scanner inputNum2 = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		double num1, num2;
		String op;

		System.out.print("Enter first number: ");
		num1 = inputNum1.nextDouble();
		System.out.print("Enter operator: ");
		op = input.next();
		System.out.print("Enter second number: ");
		num2 = inputNum2.nextDouble();

		if(op.equals("+"))
			System.out.println(add(num1,num2));
		else if(op.equals("-"))
			System.out.println(subtract(num1,num2));
		else if(op.equals("*"))
			System.out.println(mult(num1,num2));
		else if(op.equals("/"))
			System.out.println(div(num1,num2));
		else
			System.out.println("Bad operator");
	}

	static double add(double n1, double n2)
	{
		return n1 + n2;
	}
	static double subtract(double n1, double n2)
	{
		return n1 - n2;
	}
	static double mult(double n1, double n2)
	{
		return n1 * n2;
	}
	static double div(double n1, double n2)
	{
		return n1 / n2;
	}
}