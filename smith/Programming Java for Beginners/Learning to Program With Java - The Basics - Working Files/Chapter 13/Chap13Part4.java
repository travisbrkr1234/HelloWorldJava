public class Chap13Part4
{
   public static void main(String[] args)
   {
      Object anObject = new Employee("Smith", 30000);
      System.out.println("Type of anObject: " + anObject.getClass().getName());
      Employee e1 = (Employee)anObject; // casting
      System.out.println(e1.displayEmpInfo());
   }
}