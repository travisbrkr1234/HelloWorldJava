import java.util.Scanner;

public class Chap10Part1
{
	public static void main(String[] args)
	{
		int num = 1;
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter a number: ");
		num = input.nextInt();
		System.out.println(num + " squared equals " + square(num));
	}
	
	static int square(int number)
	{
		return number * number;
	}
}