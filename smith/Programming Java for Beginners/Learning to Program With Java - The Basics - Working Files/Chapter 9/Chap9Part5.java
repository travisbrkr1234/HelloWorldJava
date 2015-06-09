/*

lcv - loop control variable

for(initialize lcv; rel test lcv; modify lcv) {
   statements;
}

*/
public class Chap9Part5
{
   public static void main(String[] args)
   {
      int sum = 0;
      for(int i = 1; i <= 10; ++i) {
         sum += i;
      }
      System.out.println("The sum of 1 to 10 is " + sum);
   }
}