public class Chap15Part2
{
   public static void main(String[] args)
   {
      final int size = 10;
      int[] numbers = new int[size];  
      for(int i = 0; i < size; ++i)
         numbers[i] = i+1;
      for(int i = 0; i < size; ++i)
         System.out.print(numbers[i] + " ");
      int total = 0;
      for(int i = 0; i < size; ++i)
         total += numbers[i];
      System.out.println("Total: " + total);
   }
}