import java.util.Scanner;

public class Chap10Part4
{
	public static void main(String[] args)
	{
		/*Scanner input = new Scanner(System.in);
		int num;

		System.out.print("Enter a number: ");
		num = input.nextInt();
		if (isEven(num))
			System.out.println(num + " is even.");
		else
			System.out.println(num + " is odd.");*/

		String sentence;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		sentence = input.nextLine();
		for (int pos = 0; pos<sentence.length();++pos)
			if(isVowel(sentence.charAt(pos)))
				System.out.print(sentence.charAt(pos));
			

	}

	static boolean isEven(int number)
	{
		if (number % 2== 0)
			return true;
		else
			return false;
	}
	static boolean isVowel (char c)
	{
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			return true;
		else 
			return false;
	}
}