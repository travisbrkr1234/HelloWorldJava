import java.util.Scanner;
import java.util.ArrayList;

public class Chap17Part1
{
	static int numerator, denominator, result;
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args)
	{
		try
		{
			System.out.print("Enter the numerator: ");
			numerator = input.nextInt();

			System.out.print("Enter the denominator: ");
			denominator = input.nextInt();
		
			result = numerator/denominator;
			System.out.println("The result is " + result);
		}
		catch (ArithmeticException ae)
		{
			System.out.println("You tried to divide by zero. Try again.");
			System.out.print("Enter a new denominator: ");
			denominator = input.nextInt();
			result = numerator/denominator;
			System.out.println("The result is " + result);
		}
	}
}