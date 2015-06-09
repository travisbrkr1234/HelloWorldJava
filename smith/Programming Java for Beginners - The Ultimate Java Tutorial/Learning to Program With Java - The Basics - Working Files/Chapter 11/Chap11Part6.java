import java.util.Random;
import java.util.ArrayList;

public class Chap11Part6
{
   public static void main(String[] args) 
   {
      Random rand = new Random(System.currentTimeMillis());
      int number;
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      for(int i = 0; i < 10; ++i) {
         number = rand.nextInt(101);
         numbers.add(number);
      }
      display(numbers);
   }
   static void display(ArrayList arr) {
      for(int i = 0; i < arr.size(); ++i)
         System.out.print(arr.get(i) + " ");
   }
}