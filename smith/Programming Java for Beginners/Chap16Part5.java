import java.util.Scanner;
import java.util.ArrayList;

public class Chap16Part5
{
	public static void main(String[] args)
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int[] number = new int[10];

		for(int i=1;i<11;++i)
			numbers.add(i);
		for(int num : numbers)
			System.out.print(num+" ");
		System.out.println();
		for(int i=1;i<10;++i)
			number[i] = i+1;
		for(int num : number)
			System.out.print(num+" ");

		
	}
}