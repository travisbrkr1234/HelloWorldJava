import java.util.Scanner;
import java.util.ArrayList;

public class Chap11Part5
{
	public static void main(String[] args)
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 1; i<11; ++i)
			numbers.add(i);
		display(numbers);
		change(numbers, 5);
		display(numbers);
	}
	static void display(ArrayList arr)
	{
		for(int i=0;i<arr.size();++i)
			System.out.print(arr.get(i) + " ");
		System.out.println();
	}
	static void change(ArrayList<Integer> arr, int amount)
	{
		int value;

		for (int i=0;i<arr.size();++i)
		{
			value = arr.get(i);
			arr.set(i, value + amount);
		}
	}
}