public class Chap9Part4
{
  public static void main(String[] args)
  {
      double balance = 5000;
      double rate = 1.02;
      int years = 0;
      while (balance <= 100000){
        balance *= rate;
        ++years;
      }
      System.out.println("It will take " + years + " years to reach 100000.");
  }
}
