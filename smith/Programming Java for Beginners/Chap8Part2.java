import java.util.Scanner;

public class Chap8Part2
{
	public static void main(String[] args)
	{
		/*
		
		&&	And logical operator
		||	Or logical operator

		*/

		int hoursWorked = 43;
		int salary = 47000;
		System.out.println((hoursWorked > 40) && (salary <= 50000)); //true

		String password ="guest";
		System.out.println((password == "guest") || (password == "GUEST")); //true

		
		
	}
}