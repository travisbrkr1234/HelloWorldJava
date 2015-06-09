import java.util.Random;

public class Chap15Part7
{
   public static void main(String[] args)
   {
      final int size = 101;
      int[] numbers = new int[size];
      int[] distribution = new int[size];
      Random rand = new Random(System.currentTimeMillis());
      for(int i = 0; i < size; ++i)
         numbers[i] = rand.nextInt(100-1+1) + 1;
      for(int i = 0; i < size; ++i)
         ++distribution[numbers[i]];
      for(int i = 0; i < size; ++i) {
         System.out.print(numbers[i] + " ");
         if ((i+1) % 10 == 0)
            System.out.println();
      }
      for(int i = 1; i < size; ++i)
         System.out.println("Number " + i + " occurs " + distribution[i] + " times.");
      showHistogram(distribution, size);
   }

   static void showHistogram(int[] arr, int size) {
      String stars = "";
      int totStars = 0;
      for(int i = 0; i < size; ++i) {
         totStars = arr[i];
         for(int j = 1; j <= totStars; ++j)
            stars += "*";
         System.out.println(i + ": " + stars);
         stars = "";
         totStars = 0;
      }
   }     
}        