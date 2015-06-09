import java.util.Scanner;

/*

if (rel exp) {
   if (rel exp) {
      if (rel exp) {
         statement;
      }
      else {
         statement;
      }
   }
}

*/

public class Chap8Part4
{
   public static void main(String[] args)
   {
      int grade;
      String letterGrade;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a grade: ");
      grade = input.nextInt();
      if (grade >= 90) { 
         if (grade >= 95) {
            letterGrade = "A+";
            System.out.println("Your letter grade is " + letterGrade);
         }
         if (grade >= 93) {
            letterGrade = "A";
            System.out.println("Your letter grade is " + letterGrade);
         } else
            letterGrade = "A-";
            System.out.println("Your letter grade is " + letterGrade);
      } else 
         System.out.println("Sorry, you didn't make an A.");
      
   }
}

      