import java.util.Scanner;

public class AsciiValueMap
{
  public static void main(String[] args)
  {
    for (int c=32; c<128; c++) {
      System.out.println(c + ": " + (char)c);
     }
  }
}
