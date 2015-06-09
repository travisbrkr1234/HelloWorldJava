import java.util.Scanner;

public class Chap9Part8
{
	public static void main(String[] args)
	{
		String answer = "Watson";
		String response = "";
		int tries = 0;
		Scanner input = new Scanner(System.in);

		while (tries <=3)
		{
			System.out.print("Enter the name of the computer that played on Jeopardy? ");
			response = input.nextLine();
			++tries;
			if (response.equals("Watson"))
			{
				System.out.println("That's right!");
				break;
			}
			else if(tries == 3)
			{
				System.out.println("Sorry. The answer is Watson.");
			}
			else
			{
				System.out.println("Sorry. Try again.");
			}
		}
	}
}