import java.util.Scanner;
import java.util.ArrayList;

public class Chap11Part4
{
	public static void main(String[] args)
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		for (int i = 1; i<11;++i)
			numbers.add(i);
		int total = 0;
		for(int i = 0; i<numbers.size();++i)
			total += numbers.get(i);
		System.out.println("The total is " + total);

		System.out.println("First element: " + numbers.get(0));
		System.out.println("Last element: " + numbers.get(numbers.size()-1));
	}
}