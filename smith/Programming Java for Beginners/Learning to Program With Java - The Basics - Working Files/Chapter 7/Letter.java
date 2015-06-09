import java.util.Scanner;

public class Letter
{
   public static void main(String[] args)
   {
      String name, present, yourName;
      int age;
      Scanner inputString = new Scanner(System.in);
      Scanner inputNumber = new Scanner(System.in);
      System.out.print("What is the name of the gift giver? ");
      name = inputString.nextLine();
      System.out.print("What is the present they gave you? ");
      present = inputString.nextLine();
      System.out.print("How old were you on your birthday? ");
      age = inputNumber.nextInt();
      System.out.print("What is your name? ");
      yourName = inputString.nextLine();
      System.out.println();
      System.out.println();
      System.out.println("Dear " + name + ", ");
      System.out.println();
      System.out.print("Thank you for the " + present + ". ");
      System.out.println("I really like it. I can't believe ");
      System.out.print("I'm already " + age + " years old, but ");
      System.out.println("it doesn't feel that much different than ");
      System.out.println("being " + (age-1) + ". ");
      System.out.println();
      System.out.println("Sincerely, ");
      System.out.println();
      System.out.println(yourName);
   }
}