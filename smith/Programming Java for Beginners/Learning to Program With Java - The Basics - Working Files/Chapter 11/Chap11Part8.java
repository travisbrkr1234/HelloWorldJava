import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Chap11Part8
{
   public static void main(String[] args) 
   {
      Random rand = new Random(System.currentTimeMillis());
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      for(int i = 0; i < 10; ++i)
         numbers.add(rand.nextInt(101));
      display(numbers);
      Collections.sort(numbers);
      display(numbers);
   }
   
   static void display(ArrayList arr) {
      for(int i = 0; i < arr.size(); ++i)
         System.out.print(arr.get(i) + " ");
      System.out.println();
   }
}