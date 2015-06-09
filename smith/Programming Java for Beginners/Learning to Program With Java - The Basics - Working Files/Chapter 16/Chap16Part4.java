public class Chap16Part4
{
   public static void main(String[] args) 
   {
      double balance, rate;
      int years = 0;
      balance = 150000;
      rate = 1.02;
      /*while (balance < 100000) {
         balance *= rate;
         ++years;
      }*/
      do {
         balance *= rate;
         ++years;
      } while (balance < 100000);
      System.out.println("It will take " + years + " years to reach $100,000.");
   }
}