import java.util.Scanner;
import java.util.ArrayList;

public class Chap11Part3
{
	public static void main(String[] args)
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		System.out.println("The number of items is: " + numbers.size());
		numbers.add(0);

		System.out.println("The number of items is: " + numbers.size());
		for(int i= 1; i < 11; ++i)
			numbers.add(i);
		System.out.println("The number of items is: " + numbers.size());
	}
}