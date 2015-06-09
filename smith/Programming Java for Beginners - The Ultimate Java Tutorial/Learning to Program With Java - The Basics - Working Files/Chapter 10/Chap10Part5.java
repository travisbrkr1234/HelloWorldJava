public class Chap10Part5
{
   public static void main(String[] args)
   {
      Heading("Jones", "6/6/11");
   }

   static void Heading(String name, String date) {
      System.out.println("**************");
      System.out.println("*  " + name + "   *");
      System.out.println("*  " + date + "   *");
      System.out.println("**************");
   }
}