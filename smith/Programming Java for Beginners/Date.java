public class Date
{
	public int intMonth;
	public int intDay;
	public int intYear;

	public Date(int m, int d, int y)
	{
		intMonth = m;
		intDay = d;
		intYear = y;
	}
	public Date(int m, int y)
	{
		intMonth = m;
		intDay = 0;
		intYear = y;
	}
	public Date()
	{
		intMonth = 0;
		intDay = 0;
		intYear = 0;
	}

	public String toString()
	{
		return intMonth + "/" + intDay + "/" + intYear;
	}

	//get

	public int getMonth()
	{
		return intMonth;
	}
	public int getDay()
	{
		return intDay;
	}
	public int getYear()
	{
		return intYear;
	}

	//set

	public void setMonth(int m)
	{
		intMonth = m;
	}
	public void setDay(int d)
	{
		intDay = d;
	}
	public void setYear(int y)
	{
		intYear = y;
	}
	public void setDate(int m, int d, int y)
	{
		intMonth = m;
		intDay = d;
		intYear = y;
	}
}