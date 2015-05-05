import java.util.Scanner;

public class SalaryPicker {
  public static void main(String[] args)
  {
    /*System.out.println(" ");
    System.out.println("---------------");
    System.out.println("This calculator is based on\na work year containing\n52 weeks which consists of 260days");
    System.out.println("---------------");*/
    System.out.println("-----------------------");
    System.out.println("What is your First name?");
    System.out.println("-----------------------");
    String name;
    Scanner inputString = new Scanner(System.in);
    name = inputString.nextLine();
    double amountDesired, hoursWorked, dollarsPerHour;
    System.out.println(" ");
    Scanner input = new Scanner(System.in);
    System.out.println("-----------------------");
    System.out.println("Enter desired salary $: ");
    System.out.println("-----------------------");
    amountDesired = input.nextDouble();
    System.out.println(" ");
    System.out.println("---------------------------------------------------");
    System.out.println("How many hours would you like to work per week: ");
    System.out.println("---------------------------------------------------");
    hoursWorked = input.nextDouble();
    dollarsPerHour = (amountDesired/ 52) / hoursWorked;
    System.out.println(" ");
    System.out.printf("You will only have to make: $%.2f",dollarsPerHour); //carry out 1 precision then use math round to round to the nearest tenth/cent
    System.out.println(" an hour, " + name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase() + "!");
  }
}
