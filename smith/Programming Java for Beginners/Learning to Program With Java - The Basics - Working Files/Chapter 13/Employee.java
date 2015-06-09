public class Employee
{
   private String name;
   protected double salary;

   Employee(String n, double s) {
      name = n;
      salary = s;
   }
 
   public String getName() {
      return name;
   }

   public double getSalary() {
      return salary;
   }

   public String displayEmpInfo() {
      return "Name: " + name + "\n" + 
             "Salary: " + salary + "\n";
   }
}