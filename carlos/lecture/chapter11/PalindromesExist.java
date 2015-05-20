//Checks to see if input is a palindrome
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PalindromesExist {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    String palindrome;
    System.out.print("Enter a word or phrase to check if it is a palindrome: ");
    palindrome = input.nextLine();
    ArrayList<String> p = new ArrayList<String>();
    buildAL(p, palindrome);
    if (isPalindrome(p))
        System.out.println(palindrome + " is a palindrome!");
    else
        System.out.println(palindrome + " is not a palindrome!");
  }

  static void display(ArrayList arr) {
    for(int i = 0; i < arr.size(); ++i)
        System.out.print(arr.get(i));
      System.out.println();
}

  static void buildAL(ArrayList<String> pword, String word) {
    for (int i = 0; i < word.length(); ++i)
        pword.add(word.charAt(i) + "");
  }

  static boolean isPalindrome(ArrayList<String> word) {
    ArrayList<String> rword = new ArrayList<String>();
    rword.addAll(word);
    Collections.reverse(rword);
    for(int i = 0; i < word.size(); ++i)
      if (!(rword.get(i).equals(word.get(i))))
          return false;
    return true;
  }
}
