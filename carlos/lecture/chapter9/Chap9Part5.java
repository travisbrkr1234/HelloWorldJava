public class Chap9Part5
{
  public static void main(String[] args)
  {
        System.out.println("\t\t\t\t\t 1/3");
      for(int i = 1; i <=5; ++i) {
        System.out.println("test");
      }
        System.out.println("\t\t\t\t\t 2/3");
      for(int f = 1; f <= 100; f += 2) {
        System.out.println(f);
      }
        System.out.println("\t\t\t\t\t 3/3");
      int sum = 0;
      for(int c = 1; c <= 10; ++c) {
        sum += c;
      }
        System.out.println(sum);
  }
}
