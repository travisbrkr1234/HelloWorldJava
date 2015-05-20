public class DateTest
{

  public static void main(String[] args)
  {
    Date today = new Date(4, 30, 2015);
    Date tomorrow = new Date(5, 1, 2015);
    System.out.println("Today is: " + today.toString());
    System.out.println("Tomorrow is: " + tomorrow.toString());
      tomorrow.setDay(5);
    System.out.println("Tomorrow is: " + tomorrow.toString());
    System.out.println("Today is again, the: " + today.getMonth() + "/" +
      today.getDay() + "/" + today.getYear());
  }
}
