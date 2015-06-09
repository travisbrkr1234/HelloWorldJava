import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Chap16Part8
{
	public static void main(String[] args)
	{
		Scanner inputNum = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		Random rand = new Random(System.currentTimeMillis());
		String contChar;
		int number, guess;
		
		number = rand.nextInt(11);
		char cont = 'y';
	
		do
		{
			System.out.print("Guess a number: ");
			guess = inputNum.nextInt();
			if (guess == number)
			{
				System.out.println("That's right!");
				break;
			}
			System.out.print("Sorry. Do you want to guess again? (y/n/) ");
			contChar = input.nextLine().toLowerCase();
			cont = contChar.charAt(0);
		}while (cont != 'n');
	}
}