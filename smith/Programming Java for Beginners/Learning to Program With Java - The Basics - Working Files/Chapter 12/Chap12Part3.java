public class Chap12Part3
{
   public static void main(String[] args) 
   {
      Time theTime = new Time(9,0,0);
      theTime.increment(30);
      System.out.println(theTime.display());
      theTime.increment(40);
      System.out.println(theTime.display());
   }
}