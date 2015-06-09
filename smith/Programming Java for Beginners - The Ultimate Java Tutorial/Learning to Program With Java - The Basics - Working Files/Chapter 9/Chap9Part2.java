public class Chap9Part2
{
   public static void main(String[] args)
   {
      // balance, rate, number of years
      double balance = 5000;
      double rate = 1.02;
      int year = 1;
      while (year <= 10) {
         balance = balance * rate; // balance *= rate;
         System.out.println("After year " + year + ", the balance is " + balance);
         ++year;
      }
      System.out.println("After 10 years the balance is " + balance + ".");
    
   }
}