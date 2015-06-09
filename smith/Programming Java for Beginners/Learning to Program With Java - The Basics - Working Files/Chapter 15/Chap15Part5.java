import java.util.Random;

public class Chap15Part5
{
   public static void main(String[] args)
   {
      final int rows = 3;
      final int cols = 5;
      int total = 0;
      double average = 0.0;
      int min = 50;
      int max = 100;
      Random rand = new Random(System.currentTimeMillis());
      int[][] grades = new int[rows][cols];
      for(int r = 0; r < rows; ++r) 
         for(int c = 0; c < cols; ++c)
            grades[r][c] = rand.nextInt(max - min + 1) + min;
      for(int r = 0; r < rows; ++r) {
         System.out.print("Student " + (r+1) + ": ");
         for(int c = 0; c < cols; ++c)
            System.out.print(grades[r][c] + " ");
         System.out.println();
      }
      for(int r = 0; r < rows; ++r) {
         for(int c = 0; c < cols; ++c)
            total += grades[r][c];
         average = total / cols;
         System.out.println("The average for student " + (r+1) + "is: " + average);
         total = 0;
         average = 0.0;
      }
   }
}
  
         
     
     