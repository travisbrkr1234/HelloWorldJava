import java.util.Scanner;

public class Chap10Part2
{
   public static void main(String[] arts) 
   {
      
   }
   
   static double ftoc(double temp) {
      double celsius;
      celsius = (temp - 32.0) * (5.0 / 9.0);
      return celsius;
   }

   static double ctof(double temp) {
      double fahrenheit;
      fahrenheit = temp * (9.0 / 5.0) + 32.0;
      return fahrenheit;
   }
}