public class DateTest
{

  public static void main(String[] args)
  {
    Date today = new Date(4, 28, 2015);
    Date tomorrow = new Date(4, 29, 2015);
    System.out.println("Tomorrow is: " + tomorrow.toString());
    tomorrow.setDay(5);
    System.out.println("Today is: " + today.getMonth() + "/" +
              today.getDay() + "/" + today.getYear());
  }
}
