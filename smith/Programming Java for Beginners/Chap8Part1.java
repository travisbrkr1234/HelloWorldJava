import java.util.Scanner;

public class Chap8Part1
{
	public static void main(String[] args)
	{
		/*

		==	equality
		>	Greater than
		>=	Greater than or qual to		
		<	less than
		<=	Less than or equal to
		!=	not equal to
		

		*/
		System.out.println("hello" == "Hello"); //false
		System.out.println(2 > 2); //false
		System.out.println(2 >= 3); //false
		System.out.println(2 < 3); //true
		System.out.println(2 <=3); //true
		String password = "password"; 
		String mypassword = "passwrd";
		System.out.println(password != mypassword); //true
		
	}
}