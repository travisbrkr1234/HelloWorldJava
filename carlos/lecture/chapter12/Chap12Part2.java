public class Chap12Part2
{
    public static void main(String[] args)
    {
      Time theTime = new Time();
      theTime.setTime(13,2,0);
      System.out.println(theTime.display());
      theTime.setHours(15);
      System.out.println(theTime.display());
      System.out.println("The hour is: " + theTime.getHours());
      theTime.setMinutes(12);
      System.out.println("minutes: " + theTime.getMinutes());
      theTime.setSeconds(23);
      System.out.println("seconds: " + theTime.getSeconds());
    }
}
