import java.util.Scanner;
import java.util.ArrayList;

public class Chap16Part2
{
	public static void main(String[] args)
	{
		char letter;
		String letterGrade;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a letter grade: ");
		letterGrade = input.nextLine().toUpperCase();
		letter = letterGrade.charAt(0);

		switch(letter)
		{
			case 'A':
			case 'B':
			case 'C':
				System.out.println("Pass");
				break;
			default:
				System.out.println("Fail");
		}
		
	}
}