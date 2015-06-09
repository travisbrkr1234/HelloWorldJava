import java.util.Scanner;
import java.util.ArrayList;

public class Chap16Part1
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
				System.out.println("90-100");
				break;
			case 'B':
				System.out.println("80-89");
				break;
			case 'C':
				System.out.println("70-79");
				break;
			case 'D':
				System.out.println("60-69");
				break;
			default:
				System.out.println("Below 60");
		}
	}
}