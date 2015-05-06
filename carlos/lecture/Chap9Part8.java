import java.util.Scanner;

public class Chap9Part8
{
  public static void main(String[] args)
  {
    String answer = "Watson";
    String response = "";
    int tries = 0;
    Scanner input = new Scanner(System.in);
    while (tries <= 3) {
      System.out.print("Enter the name of the computer that played on Jeopardy: ");
      response = input.nextLine();
      tries++;
      if (response.equals("Watson")) {
        System.out.println("Thats right!");
        break;
      } else if (tries == 3) {
        System.out.println("No! The answer is Watson!");
        break;
      } else {
        System.out.println("Sorry, Try again!");
      }
    }
  }
}
