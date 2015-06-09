import java.util.Scanner;

public class Chap10Part6
{
	public static void main(String[] args)
	{
		int num = 12;
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter a number: ");
		num = input.nextInt();
		System.out.println("number squared: " + square(num));
		System.out.println("original number: " + num);
	}
	
	static int square(int number)
	{
		number *= number;
		System.out.println("num in square method: " + number);
		return number;
	}
}