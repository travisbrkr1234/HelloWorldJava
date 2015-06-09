import java.util.Scanner;

public class Chap8Part4
{
	public static void main(String[] args)
	{
		int grade;
		String letterGrade;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a grade: ");
		grade = input.nextInt();

		if (grade >= 90)
		{
			if (grade >= 95)
			{
				letterGrade = "A+";
			}
			if (grade >= 93)
			{
				letterGrade = "A";
			}
			else
			{
				letterGrade = "A-";
			}

		}
		else
		{
			System.out.println("Sorry, you didn't make a A.");
		}
	}
}