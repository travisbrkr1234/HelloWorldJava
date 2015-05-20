import java.util.Scanner;

public class Chap8Part6 {
  public static void main(String[] args)
  {
	   String message = "You should ";
     String messageTwo = " if it is: ";
     int temp;
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the current temperature: ");
     temp = input.nextInt();
     if (temp > 85)
      message = message + "go swimming";
     else if (temp >= 70)
      message = message + "play tennis";
     else if (temp >= 32 )
      message = message + "play golf";
     else if (temp >= 0 )
      message = message + "go dancing";
     else
      message = message + "sit by the fire";
     System.out.println(message + messageTwo + temp + " outside");
  }
}
