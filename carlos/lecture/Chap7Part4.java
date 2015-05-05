import java.util.Scanner;

public class Chap7Part4 {
  public static void main(String[] args)
  {
    String name;
    Scanner input = new Scanner (System.in);
    System.out.println("Enter your name: ");
    name = input.nextLine();
    System.out.println("Your name is: " + name);
  }
}
