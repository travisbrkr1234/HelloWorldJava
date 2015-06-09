import java.util.Scanner;

public class Chap7Part3
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		//int number, number1, sum;
		double number, number1, sum;
		System.out.print("Enter the first number: ");
		//number = input.nextInt();
		number = input.nextDouble();
		System.out.print("Enter the Second number: ");
		//number1 = input.nextInt();
		number1 = input.nextDouble();
		sum = number + number1;
		System.out.println("The sum is " + sum);
	}
}