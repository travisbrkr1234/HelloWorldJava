import java.util.Scanner;

/*

Temperature	Activity
> 85		Swimming
70-85		Tennis
32-69		Golf
0 - 31		Dancing
Below 0		Sit by the fire
*/

public class Chap8Part6
{
   public static void main(String[] args) 
   {
      String message = "The recommended activity is ";
      int temp;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the temperature: ");
      temp = input.nextInt();
      if (temp > 85)
         message = message + "swimming.";
      else if (temp >= 70)
         message = message + "tennis.";
      else if (temp >= 32)
         message = message + "golf.";
      else if (temp >= 0)
         message = message + "dancing.";
      else
         message = message + "sitting by the fire.";
      System.out.println(message);
   }
}
