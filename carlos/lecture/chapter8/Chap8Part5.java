import java.util.Scanner;

public class Chap8Part5 {
  public static void main(String[] args)
  {
	  int grade;
	  String letterGrade = "";
	  Scanner input = new Scanner(System.in);
      System.out.printf("Enter a grade: ");
      grade = input.nextInt();
      if (grade >= 90) {
         letterGrade = "A";
      } else if (grade >= 80) {
         letterGrade = "B";
      } else if (grade >= 70) {
         letterGrade = "C";
      } else if (grade >= 60) {
         letterGrade = "D";
      } else if (grade >= 0) {
         letterGrade = "F";
      } else
         System.out.println("Didn't recognize input.");
      System.out.println("A grade of " + grade + "% is the letter " + letterGrade + ".");
   }
  }
