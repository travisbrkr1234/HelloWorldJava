import java.util.Scanner;

public class Chap10Part3
{
	public static void main(String[] args)
	{
		Scanner inputTemp = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);
		double temp;
		String type;

		System.out.print("Enter a temperature to convert: ");
		temp = inputTemp.nextDouble();
		System.out.print("Enter type to convert to (C or F): ");
		type = inputStr.next();
		System.out.println("The converted temperature is " +
				   convert(temp, type));
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
	static double convert(double temp, String type)
	{
		if (type.equals("C"))
			return (temp - 32.0) * (5.0/9.0);
		else
			return temp * (9.0/5.0) + 32.0;
	}
}