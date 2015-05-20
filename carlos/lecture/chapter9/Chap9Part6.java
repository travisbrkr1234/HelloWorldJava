public class Chap9Part6
{
  public static void main(String[] args)
  {
      double balance = 5000;
      double rate = 1.02;
      for(int i = 1; i <= 10; i++) {
        balance *= rate;
      }
      System.out.println("Balance in 10 years is: " + balance);
  }
}
