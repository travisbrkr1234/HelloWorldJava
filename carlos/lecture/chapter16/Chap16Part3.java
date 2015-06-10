public class Chap16Part3 {
/*
do {
    set of statements;
  } while(relational expression);
*/

  public static void main(String[] args)
  {
    int number = 12;
    do {
      System.out.println(number);
      ++number;
    } while (number < 11);
  }
}
