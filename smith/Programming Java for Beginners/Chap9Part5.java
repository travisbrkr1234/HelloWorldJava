import java.util.Scanner;

public class Chap9Part5
{
	public static void main(String[] args)
	{
		/*for(int i = 1; i<=5;++i)
		{
			System.out.println("Hello, World!");
		}

		for(int i = 1; i<=100; i+=2)
		{
			System.out.println(i);
		}*/
		int sum = 0;
		for(int i = 1; i<=10; ++i)
		{
			sum +=i;
		}
		System.out.println("The sum of 1 to 10 is " + sum);
	}
}