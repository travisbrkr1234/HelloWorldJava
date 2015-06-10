import java.util.ArrayList;

public class Chap16Part6 {
   public static void main(String[] args)
   {
       ArrayList<Employee> emps = new ArrayList<Employee>();
       Employee emp1 = new Employee("Brown", 20000);
       Employee emp2 = new Employee("Smith", 21000);
       Employee emp3 = new Employee("Jones", 22000);
       Employee emp4 = new Employee("Green", 23000);
       emps.add(emp1);
       emps.add(emp2);
       emps.add(emp3);
       emps.add(emp4);
       for(Employee emp : emps)
          System.out.println(emp.displayEmpInfo());
   }
}
