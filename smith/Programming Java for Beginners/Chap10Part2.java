import java.util.Scanner;

public class Chap10Part2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);
		double ftemp, ctemp;
		String tempIn = "";
		
		System.out.print("Choose what you want the temperature coverted to C or F: ");
		tempIn = inputStr.nextLine();

		if(tempIn.equals("C"))
		{
			System.out.print("Enter a temperature in Fahrenheit: ");
			ftemp = input.nextDouble();
			ctemp = fToC(ftemp);
			System.out.println(ftemp + " F is equal to " + ctemp + " C.");
		}
		else if (tempIn.equals("F"))
		{
			System.out.print("Enter a temperature in Celsius: ");
			ctemp = input.nextDouble();
			ftemp = cToF(ctemp);
			System.out.println(ctemp + " C is equal to " + ftemp + " F.");
		}
		else
		{
			System.out.println("Not valid");
		}
		
	}

	static double fToC(double temp)
	{
		double celsius;
		celsius = (temp - 32.0) * (5.0/9.0);
		return celsius;
	}

	static double cToF(double temp)
	{
		double fahrenheit;
		fahrenheit = temp * (9.0/5.0) + 32.0;
		return fahrenheit;
	}
}