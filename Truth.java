public class Truth {
   public static void main(String[] args) {
     boolean boolVar;
           System.out.println("-------------Stuff-------------");
           System.out.println("! NOT");
           System.out.println("== Equal to");
           System.out.println("!= Not Equal to");
           System.out.println("&& AND");
           System.out.println("< Less Than");
           System.out.println("|| OR");
           System.out.println("> Greater Than");
           System.out.println("<= >= Less Than or equal to, Greater Than or equal to");
           System.out.println("-------------Stuff-------------");
           System.out.println("");
           System.out.println("-------------Problems-------------");
           boolVar = (2 < 3);
           System.out.println("2 < 3? Answer is " + boolVar);
           boolVar = (4 == 5);
           System.out.println("4 == 5? Answer is " + boolVar);
           boolVar = (4 == 5) && (5 < 6);
           System.out.println("If 4 is equal to 5 and 5 is less than 6,");
           System.out.println("Given 6 is greater than 5, the answer is " + boolVar);
           System.out.println("Below is a riddle, enjoy :)");
           System.out.println("(5 > 9) == (1 == 1) && (5 == 5) == (9 < 5)");
           boolVar = (5 > 9) == (1 == 1) && (5 == 5) == (9 < 5);
           System.out.println("if false is true and true is false  what is true?" + " ..." + boolVar);
           System.out.println("-------------Problems-------------");
     }
}
