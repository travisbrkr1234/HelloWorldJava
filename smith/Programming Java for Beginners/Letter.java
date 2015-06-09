import java.util.Scanner;

public class Letter
{
	public static void main(String[] args)
	{
		String name,yourName,present;
		int age;
		Scanner inputString = new Scanner(System.in);
		Scanner inputNumber = new Scanner(System.in);
		
		System.out.print("What is the name of the gift giver? ");
		name = inputString.nextLine();
		System.out.print("What is the present they gave you? ");
		present = inputString.nextLine();
		System.out.print("How old were you on your birthday? ");
		age = inputNumber.nextInt();
		System.out.print("What is your name? ");
		yourName = inputString.nextLine();

		System.out.print();
		System.out.print();
		System.out.print("Dear " + name + ",\n");
		System.out.print("\n");
		System.out.print("Thank you for the " + present + ", I really like it. I can't believe I'm\n");
		System.out.print("already " + age + " years old, but it doesn't feel like that much different than\n");
		System.out.print("being " + (age - 1) + ".\n");
		System.out.print("\n");
		System.out.print("Thank you again for the " + present + ".\n");
		System.out.print("\n");
		System.out.print("Sincerely,\n");
		System.out.print("\n");
		System.out.print(yourName);
	}
}