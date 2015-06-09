public class Calc
{
	private double number;
	
	Calc(double n)
	{
		number = n;
	}

	public void add(double n)
	{
		number += n;
	}
	public void subtract(double n)
	{
		number -= n;
	}
	public void div(double n)
	{
		number /= n;
	}
	public void mult(double n)
	{
		number *= n;
	}
	public double show()
	{
		return number;
	}
}