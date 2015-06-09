import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Chap11Part9
{
	public static void main(String[] args)
	{
		Scanner scnWord= new Scanner(System.in);
		String strWord;
		ArrayList<String> palindrome = new ArrayList<String>();

		System.out.print("Please enter word or phrase: ");
		strWord = scnWord.nextLine();
		buildAL(palindrome, strWord);
		if(isPalindrome(palindrome))
			System.out.println(strWord + " is a palindrome.");
		else
			System.out.println(strWord + " is not a palindrome.");
	}
	static void display(ArrayList arr)
	{
		for (int i = 0; i<arr.size();++i)
			System.out.print(arr.get(i) + " ");
		System.out.println();
	}
	static void buildAL(ArrayList<String> pword, String word)
	{
		for (int i=0;i<word.length();++i)
			pword.add(word.charAt(i) + "");
	}
	static boolean isPalindrome(ArrayList<String> word)
	{
		ArrayList<String> rword = new ArrayList<String>();
		rword.addAll(word);
		Collections.reverse(rword);
		for(int i=0;i<word.size();++i)
			if(!(rword.get(i).equals(word.get(i))))
				return false;
		return true;
	}
}