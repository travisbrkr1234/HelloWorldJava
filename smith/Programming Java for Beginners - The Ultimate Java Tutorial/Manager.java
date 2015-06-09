public class Manager extends Employee
{
	private String department;

	Manager(String n, double s, String d)
	{
		super(n,s);
		department = d;
	}

	public String getDepartment()
	{
		return department;
	}

	public String displayEmpInfo()
	{
		String empinfo = super.displayEmpInfo();
		return empinfo + "Department: " + department + "\n";
	}

	public void changeSalary(Employee e, double amount)
	{
		e.salary = amount;
	}
}